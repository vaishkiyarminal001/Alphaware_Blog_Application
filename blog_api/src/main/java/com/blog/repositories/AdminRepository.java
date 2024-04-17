package com.blog.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blog.entities.Admin;


public interface AdminRepository extends JpaRepository<Admin, Integer>{
	Optional<Admin>findByEmail(String email);

}
