package com.example.demo.entites;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Pricing {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long pricingId;
	
	@ManyToOne
    @JoinColumn(name = "service_id", referencedColumnName = "serviceId")
	private Services serviceId;
	
	@ManyToOne
    @JoinColumn(name = "product_id", referencedColumnName = "productId")
	private Products productId;
	
	private Double price;
	
	private int unitType;
	
	
	

}
