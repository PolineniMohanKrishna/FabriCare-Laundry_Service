package com.example.demo.service;

import java.util.List;
import java.util.Optional;



import com.example.demo.entites.Users;


public interface UserService {

	public Users save(Users user);
	public List<Users> getAll();
	public Optional<Users> getById( Long id);
	public void deleteById(Long id);
	
	public Optional<Users>findByUsername(String username);
	

}
