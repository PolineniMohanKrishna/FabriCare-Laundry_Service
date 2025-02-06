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

import com.example.demo.entites.Products;
import com.example.demo.service.ProductService;

@RestController
@RequestMapping("/fabricare/api")
public class ProductsRestController {
	@Autowired
	private ProductService productService;
	
	@GetMapping("/products")
	public List<Products> getAllProducts()
	{
		return productService.getAll();
	}
	
	@GetMapping("/products/{id}")
	public Optional<Products> getProductsById(@PathVariable("id") Long id)
	{
		return productService.getId(id);
	}
	
	@PutMapping("/products")
	public Products updateProducts(@RequestBody Products product)
	{
		return productService.update(product);
	}
	
	@PostMapping("/products")
	public ResponseEntity<String> addProducts(@RequestBody Products product)
	{
		productService.save(product);
		
		return new ResponseEntity<>("product added sucessfully",HttpStatus.OK);
	}
	
	@DeleteMapping("/products/{id}")
	public String deleteProduct(@PathVariable("id") Long id)
	{
		productService.deleteById(id);
		return "product with Id="+id+" is deleted sucessfully";
	}
	
//	@GetMapping("/products/{productName}")
//	public List<Products> getProductByName(@PathVariable("productName") String productName)
//	{
//		return productService.findBy
//	}

}
