package com.example.demo.service;

import java.util.Optional;

import com.example.demo.entites.SignIn;

public interface SignInService {
	Optional<SignIn >findByUsername(String username);

}
