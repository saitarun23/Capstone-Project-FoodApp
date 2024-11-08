package com.entity;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "orderinfo")
public class OrdersInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int oid;
	private String emailid;
	@ManyToMany
	@JoinTable(name = "productorderinfo")
	private List<Product> products;
	private int totalamount;
	private LocalDateTime orderdate;
}
