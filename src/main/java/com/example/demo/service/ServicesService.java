package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entites.Services;



public interface ServicesService {
	public List<Services> getAll();
	public Optional<Services> getId(Long id);
	public Services save(Services service);
	public Services update(Services service);
	public void deleteById(Long id);
}
