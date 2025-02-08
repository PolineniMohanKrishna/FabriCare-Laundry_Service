package com.example.demo.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entites.Users;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/fabricare/api")
@CrossOrigin
public class RegisterController {
	
	@Autowired
	private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody Users users) {
    	
    	userService.save(users);
    	return ResponseEntity.ok("Registration successful!");
//        // Assuming you have a service to handle registration logic
//        boolean isRegistered = userService.registerUser(signUpRequest);
//        if (isRegistered) {
//            return ResponseEntity.ok("Registration successful!");
//        } else {
//            return ResponseEntity.badRequest().body("Registration failed. User may already exist.");
//        }
    }
}
