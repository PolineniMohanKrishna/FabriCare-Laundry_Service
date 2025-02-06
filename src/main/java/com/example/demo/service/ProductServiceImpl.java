package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entites.Products;
import com.example.demo.repository.ProductsRepository;
@Service
@Transactional
public class ProductServiceImpl implements ProductService{
	@Autowired
	private ProductsRepository productRepo;
	@Override
	public List<Products> getAll() {
		// TODO Auto-generated method stub
		return productRepo.findAll();
	}

	@Override
	public Optional<Products> getId(Long id) {
		// TODO Auto-generated method stub
		return productRepo.findById(id);
	}

	@Override
	public Products save(Products product) {
		// TODO Auto-generated method stub
		return productRepo.save(product);
	}

	@Override
	public Products update(Products product) {
		// TODO Auto-generated method stub
		return productRepo.save(product);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		productRepo.deleteById(id);
	}

}
