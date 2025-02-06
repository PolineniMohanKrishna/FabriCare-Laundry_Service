package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entites.Pricing;
import com.example.demo.repository.PricingRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class PricingServiceImple implements PricingService{
	
	@Autowired
	private PricingRepository pricingRepo;
	

	@Override
	public List<Pricing> getAll() {
		// TODO Auto-generated method stub
		return pricingRepo.findAll();
	}

	@Override
	public Optional<Pricing> getId(Long id) {
		// TODO Auto-generated method stub
		return pricingRepo.findById(id);
	}

	@Override
	public Pricing save(Pricing pricing) {
		// TODO Auto-generated method stub
		return pricingRepo.save(pricing);
	}

	@Override
	public Pricing update(Pricing pricing) {
		// TODO Auto-generated method stub
		return pricingRepo.save(pricing);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		pricingRepo.deleteById(id);
	}
	

}
