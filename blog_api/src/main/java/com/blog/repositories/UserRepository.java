package com.blog.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blog.entities.MyUser;

public interface UserRepository extends JpaRepository<MyUser, Integer> {
	
	Optional<MyUser> findByEmail(String Email);

}
