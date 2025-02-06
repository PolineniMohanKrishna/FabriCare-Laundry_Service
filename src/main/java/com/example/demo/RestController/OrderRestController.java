package com.example.demo.RestController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entites.Orders;
import com.example.demo.service.OrderService;

@RestController
@RequestMapping("/fabricare/api")
public class OrderRestController {
	
	@Autowired
	private OrderService orderService;
	

	@GetMapping("/orders")
	public List<Orders> getAllOrders()
	{
		return orderService.getAll();
	}
	
	@GetMapping("/orders/{id}")
	public Optional<Orders> getOrderById(@PathVariable("id") Long id)
	{
		return orderService.getId(id);
	}
	
	@PutMapping("/orders")
	public Orders updateOrder(@RequestBody Orders order)
	{
		return orderService.update(order);
	}
	
	@PostMapping("/orders")
	public ResponseEntity<String> addOrder(@RequestBody Orders order)
	{
		orderService.save(order);
		
		return new ResponseEntity<>("Order added sucessfully",HttpStatus.OK);
	}
	
	@DeleteMapping("/orders/{id}")
	public String deleteOrder(@PathVariable("id") Long id)
	{
		orderService.deleteById(id);
		return "Order with Id="+id+" is deleted sucessfully";
	}
}
