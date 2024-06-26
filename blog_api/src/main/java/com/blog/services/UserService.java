package com.blog.services;

import java.util.Optional;

import com.blog.entities.MyUser;
import com.blog.exceptions.UserException;

public interface UserService {
	
	MyUser createUser(MyUser myUser) throws UserException;
	MyUser updateUser(MyUser myUser, Integer userId) throws UserException;
	MyUser getUserById(Integer userId) throws UserException;
	MyUser deleteUser(Integer user) throws UserException;
	Optional<MyUser> findByEmail(String Email);

}
