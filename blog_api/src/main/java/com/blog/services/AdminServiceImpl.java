package com.blog.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.entities.Admin;
import com.blog.entities.MyUser;
import com.blog.exceptions.AdminException;
import com.blog.exceptions.UserException;
import com.blog.repositories.AdminRepository;
import com.blog.repositories.UserRepository;

@Service
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private AdminRepository adminRepository;

//	logic for create Admin
	@Override
	public Admin createAdmin(Admin admin) throws AdminException {
		return adminRepository.save(admin);
	}

//	logic for checking all the usser 
	@Override
	public List<MyUser> getAllUsers() {
		List<MyUser> myUsers = userRepository.findAll();
		return myUsers;
	}

//	logic for update Admin
	@Override
	public Admin updateAdmin(Admin admin, Integer adminId) throws AdminException {
		Admin us = adminRepository.findById(adminId)
				.orElseThrow(() -> new AdminException("Admin not found by this AdminID" + adminId));
		
		us.setName(admin.getName());
		us.setEmail(admin.getEmail());
		
		return adminRepository.save(us);
	}

	@Override
	public Admin getAdminById(Integer AdminId) throws AdminException {
		Optional<Admin> admin = adminRepository.findById(AdminId);
		if(!admin.isPresent()) throw new UserException("Admin not found by given id " + AdminId);
		Admin us = admin.get();
		return us;
	}

	@Override
	public Admin deleteAdmin(Integer adminId) throws AdminException {
		Optional<Admin> optionalUser = adminRepository.findById(adminId);
		 if(optionalUser.isPresent()) {
			 Admin admin = optionalUser.get();
			 adminRepository.delete(admin);
			 return admin;
		 }else {
			 throw new UserException("Admin not found for the given id: "+adminId);
		 }
	}

	@Override
	public Optional<Admin> findByEmail(String Email) {
		Optional<Admin> user= adminRepository.findByEmail(Email);
		 if(user.isEmpty()) throw new AdminException("No admin found");
		 return user;
	}
	
	
	

}
