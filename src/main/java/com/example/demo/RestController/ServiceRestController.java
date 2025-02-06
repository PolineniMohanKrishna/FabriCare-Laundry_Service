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


import com.example.demo.entites.Services;
import com.example.demo.service.ServicesService;

@RestController
@RequestMapping("/fabricare/api")
public class ServiceRestController {
	
	@Autowired
	private ServicesService servicesService;

	@GetMapping("/services")
	public List<Services> getAllService()
	{
		return servicesService.getAll();
	}
	
	@GetMapping("/services/{id}")
	public Optional<Services> getServiceById(@PathVariable("id") Long id)
	{
		return servicesService.getId(id);
	}
	
	@PutMapping("/services")
	public Services updateService(@RequestBody Services service)
	{
		return servicesService.update(service);
	}
	
	@PostMapping("/services")
	public ResponseEntity<String> addService(@RequestBody Services service)
	{
		servicesService.save(service);
		
		return new ResponseEntity<>("service added sucessfully",HttpStatus.OK);
	}
	
	@DeleteMapping("/services/{id}")
	public String deleteService(@PathVariable("id") Long id)
	{
		servicesService.deleteById(id);
		return "service with Id="+id+" is deleted sucessfully";
	}

}
