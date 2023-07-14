package com.sanju.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "CUSTOMER_TBL")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CUST_ID")
	private long custId;
	
	@Column(name = "CUST_NAME_F")
	private String custNameF;
	
	@Column(name = "CUST_NAME_L")
	private String custNameL;
	
	@Column(name = "CUST_EMAIL")
	private String email;
	
	@Column(name = "CUST_MOBILE")
	private String mobileNumber;
	
	@Column(name = "CUST_PASSWORD")
	private String password;
	
	
}
