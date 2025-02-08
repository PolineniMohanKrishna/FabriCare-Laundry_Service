package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entites.SignIn;
import com.example.demo.entites.Users;

public interface UserRepository extends JpaRepository<Users, Long>{
	Optional<Users> findByUserName(String userName);
}
