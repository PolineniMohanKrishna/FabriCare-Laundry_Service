package com.example.demo.RestController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entites.Pricing;
import com.example.demo.service.PricingService;


@RestController
@RequestMapping("/fabricare/api")
@CrossOrigin
public class PricingRestController {
	
	
	@Autowired
	private PricingService pricingService;
	
	@GetMapping("/pricing")
	public List<Pricing> getAllPrices()
	{
		return pricingService.getAll();
	}
	
	@GetMapping("/pricing/{id}")
	public Optional<Pricing> getPriceById(@PathVariable("id") Long id)
	{
		return pricingService.getId(id);
	}
	
	@PutMapping("/pricing")
	public Pricing updatePrice(@RequestBody Pricing pricing)
	{
		return pricingService.update(pricing);
	}
	
	@PostMapping("/pricing")
	public ResponseEntity<String> addPrice(@RequestBody Pricing pricing)
	{
		pricingService.save(pricing);
		
		return new ResponseEntity<>("Pricing added sucessfully",HttpStatus.OK);
	}
	
	@DeleteMapping("/pricing/{id}")
	public String deletePrice(@PathVariable("id") Long id)
	{
		pricingService.deleteById(id);
		return "pricing with Id="+id+" is deleted sucessfully";
	}
}
