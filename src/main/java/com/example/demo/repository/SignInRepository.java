package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entites.SignIn;
@Repository
public interface SignInRepository extends JpaRepository<SignIn, Long>{
	Optional<SignIn> findByUserName(String userName);

}
