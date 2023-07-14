package com.sanju.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sanju.entity.Customer;

public interface CustomerRepo extends JpaRepository<Customer,Long>{
	
	
}
