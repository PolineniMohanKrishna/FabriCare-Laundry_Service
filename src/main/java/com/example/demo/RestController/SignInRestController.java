package com.example.demo.RestController;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entites.SignIn;
import com.example.demo.entites.Users;
import com.example.demo.service.SignInService;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/fabricare/api")
@CrossOrigin
public class SignInRestController {
	
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/Signin")
	 public ResponseEntity<String> login(@RequestBody SignIn user) {
        Optional<Users> existingUser = userService.findByUsername(user.getUserName());

        if (existingUser.isPresent()) {
        	return ResponseEntity.ok("Login successful");
        } else {
            return ResponseEntity.badRequest().body("User not found");
        }
    }
	
	

}
