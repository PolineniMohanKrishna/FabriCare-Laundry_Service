package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entites.Products;
@Repository
public interface ProductsRepository extends JpaRepository<Products, Long>{

}
