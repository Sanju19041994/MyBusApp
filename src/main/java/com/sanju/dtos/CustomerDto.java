package com.sanju.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDto {

	private long custId;

	private String custNameF;

	private String custNameL;

	private String email;

	private String mobileNumber;
	
	private String password;
	
	
}
