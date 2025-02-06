package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entites.Services;
import com.example.demo.repository.ServicesRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ServicesServiceImple implements ServicesService{
	
	@Autowired
	private ServicesRepository serviceRepo;

	@Override
	public List<Services> getAll() {
		// TODO Auto-generated method stub
		return serviceRepo.findAll();
	}

	@Override
	public Optional<Services> getId(Long id) {
		// TODO Auto-generated method stub
		return serviceRepo.findById(id);
	}

	@Override
	public Services save(Services service) {
		// TODO Auto-generated method stub
		return serviceRepo.save(service);
	}

	@Override
	public Services update(Services service) {
		// TODO Auto-generated method stub
		return serviceRepo.save(service);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		serviceRepo.deleteById(id);
	}

}
