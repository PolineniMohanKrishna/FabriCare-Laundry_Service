package com.example.demo.RestController;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entites.SignIn;
import com.example.demo.service.SignInService;

@RestController
@RequestMapping("/")

public class SignInRestController {
	
	@Autowired
	private SignInService signInService;
	
	@PostMapping("/Signin")
	 public ResponseEntity<String> login(@RequestBody SignIn user) {
        Optional<SignIn> existingUser = signInService.findByUsername(user.getUserName());

        if (existingUser.isPresent()) {
            SignIn foundUser = existingUser.get();
            if (foundUser.getPassword().equals(user.getPassword())) {
                return ResponseEntity.ok("Login successful. Role: " + foundUser.getRole());
            } else {
                return ResponseEntity.badRequest().body("Invalid password");
            }
        } else {
            return ResponseEntity.badRequest().body("User not found");
        }
    }
	
	

}
