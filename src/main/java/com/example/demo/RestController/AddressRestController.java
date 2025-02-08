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

import com.example.demo.entites.Address;
import com.example.demo.service.AddressService;


@RestController
@RequestMapping("/fabricare/api")
@CrossOrigin
public class AddressRestController {
	@Autowired
	private AddressService addressService;
	
	@PostMapping("/address")
	public String saveAddress(@RequestBody Address address) {
		addressService.save(address);
		return "Address added Successfully";
		
	}
	@GetMapping("/address")
	public List<Address> getAllAddress(){
		return addressService.getAll();	
	}
	
	@GetMapping("/address/{id}")
	public Optional<Address> getAddressById(@PathVariable("id")Long id) {
		return addressService.getById(id);
	}
	
	@PutMapping("/address")
	public String updateAddress(@RequestBody Address address) {
		addressService.save(address);
		
		return "Address updated Successfully!!";
	}
	
	@DeleteMapping("/address/{id}")
	public String deleteAddress(@PathVariable("id")Long id) {
		addressService.deleteById(id);
		return "Address "+ id +" deleted Successfully!!";
	}


}
