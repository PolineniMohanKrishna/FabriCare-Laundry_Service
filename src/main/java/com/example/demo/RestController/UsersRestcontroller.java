package com.example.demo.RestController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entites.Users;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/fabricare/api")
@CrossOrigin
public class UsersRestcontroller {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/users")
	public String newUser(@RequestBody Users user) {
		userService.save(user);
		return "User added Successfully";
	}
	
	@GetMapping("/users")
	public List<Users> getAllUsers(){
		return userService.getAll();
	}
	
	@GetMapping("/users/{id}")
	public Optional<Users> getUserById(@PathVariable("id") Long id){
		return userService.getById(id);
	}
	
	@PutMapping("/users")
	public String updateUser(@RequestBody Users user) {
		userService.save(user);
		return "User Updated Successfully";
	}
	
	@DeleteMapping("/users/{id}")
	public String deleteuser(@PathVariable("id") Long id) {
		userService.deleteById(id);
		return "User deleted Successfully";


}
}
