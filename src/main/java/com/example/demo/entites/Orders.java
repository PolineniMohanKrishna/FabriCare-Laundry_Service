package com.example.demo.entites;

import java.util.Date;

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
public class Orders {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long orderId;
	

	@ManyToOne
	@JoinColumn(name = "user_id", referencedColumnName = "userId")
	private Users userId;

    
	@ManyToOne
    @JoinColumn(name = "service_id", referencedColumnName = "serviceId")
	private Services serviceId;
	
	private double quantity;
	
	private double totalPrice;
	
	private Date orderDate;

}
