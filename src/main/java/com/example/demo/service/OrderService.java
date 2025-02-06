package com.example.demo.service;

import java.util.List;
import java.util.Optional;


import com.example.demo.entites.Orders;

public interface OrderService {
	public List<Orders> getAll();
	public Optional<Orders> getId(Long id);
	public Orders save(Orders order);
	public Orders update(Orders order);
	public void deleteById(Long id);

}
