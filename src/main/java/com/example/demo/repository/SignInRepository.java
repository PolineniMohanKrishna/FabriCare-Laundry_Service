package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entites.SignIn;

public interface SignInRepository extends JpaRepository<SignIn, Long>{
	Optional<SignIn> findByUsername(String username);

}
