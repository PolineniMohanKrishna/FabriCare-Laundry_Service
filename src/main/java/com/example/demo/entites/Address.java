package com.example.demo.entites;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long addressId;
	
	@ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "userId")
	private Users  userId;
	
	private String HouseNo;
	
	private String Area;
	
	private String LandMark;
	
	private int PinCode;
	
	private String City;
	
	private String State;

}
