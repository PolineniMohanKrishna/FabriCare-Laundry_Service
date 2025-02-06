package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entites.Address;
import com.example.demo.repository.AddressRepository;

public class AddressServiceImple implements AddressService{

	@Autowired
	private AddressRepository addressRepository;

	@Override
	public List<Address> getAll() {
		// TODO Auto-generated method stub
		return addressRepository.findAll();
	}

	@Override
	public Optional<Address> getById(Long id) {
		// TODO Auto-generated method stub
		return addressRepository.findById(id);
	}

	@Override
	public String save(Address address) {
		addressRepository.save(address);
		return "Address added SuccessFully!!" ;

	}

	@Override
	public String deleteById(Long id) {
		addressRepository.deleteById(id);
		return "Address Deleted Successfully!!";
	}

	

}
