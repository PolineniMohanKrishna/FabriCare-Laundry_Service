package com.example.demo.service;

import java.util.List;
import java.util.Optional;


import com.example.demo.entites.Pricing;

public interface PricingService {
	public List<Pricing> getAll();
	public Optional<Pricing> getId(Long id);
	public Pricing save(Pricing pricing);
	public Pricing update(Pricing pricing);
	public void deleteById(Long id);
}
