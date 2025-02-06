package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entites.Products;

public interface ProductService {
	public List<Products> getAll();
	public Optional<Products> getId(Long id);
	public Products save(Products product);
	public Products update (Products product);
	public void deleteById(Long id);

}
