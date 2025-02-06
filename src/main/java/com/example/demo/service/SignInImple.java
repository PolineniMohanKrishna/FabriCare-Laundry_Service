package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entites.SignIn;
import com.example.demo.repository.SignInRepository;

public class SignInImple implements SignInService{
	
	@Autowired
	private SignInRepository signInRepo;
	

	@Override
	public Optional<SignIn> findByUsername(String username) {
		// TODO Auto-generated method stub
		return signInRepo.findByUsername(username);
	}

}
