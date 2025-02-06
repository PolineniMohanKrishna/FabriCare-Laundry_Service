package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entites.Address;

public interface AddressService {

	public List<Address> getAll();
	public Optional<Address>getById(Long id);
	public String save(Address address);
	public String deleteById(Long id);

}
