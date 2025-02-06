package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entites.Services;
@Repository
public interface ServicesRepository extends JpaRepository<Services, Long>{

}
