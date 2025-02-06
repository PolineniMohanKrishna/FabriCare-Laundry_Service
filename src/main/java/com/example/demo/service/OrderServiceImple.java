package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entites.Orders;
import com.example.demo.repository.OrderRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class OrderServiceImple implements OrderService{
	
	@Autowired
	private OrderRepository orderRepo;
	
	
	@Override
	public List<Orders> getAll() {
		// TODO Auto-generated method stub
		return orderRepo.findAll();
}

	@Override
	public Optional<Orders> getId(Long id) {
		// TODO Auto-generated method stub
		return orderRepo.findById(id);
	}

	@Override
	public Orders save(Orders order) {
		// TODO Auto-generated method stub
		return orderRepo.save(order);
	}

	@Override
	public Orders update(Orders order) {
		// TODO Auto-generated method stub
		return orderRepo.save(order);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		orderRepo.deleteById(id);
	}

}
