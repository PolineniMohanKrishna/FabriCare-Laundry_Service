package com.example.demo.entites;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userId;
	

	private String userName;
	
	
	private String email;
	
	
	private String password;
	
	
	private long mobileNo;
	
	 @OneToMany(mappedBy = "userId", cascade = CascadeType.ALL, orphanRemoval = true)
	    private List<Address> addresses; // this
	 
	 @OneToMany(mappedBy = "userId", cascade = CascadeType.ALL, orphanRemoval = true)
	 private List<Orders> orders;


}
