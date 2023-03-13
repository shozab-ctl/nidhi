package com.example.demo.model;

import com.example.demo.entities.User;

public class UserResponse {
	
	private Integer id;
	
	private String firstName; 
	
	private String middleName;
	
	private String lastName;
	
	private String email;
	
	private String phoneNumber;

	public UserResponse(User userEntity) {
		this.id = userEntity.getId();
		this.firstName = userEntity.getFirstName();
		this.middleName = userEntity.getMiddleName();
		this.lastName = userEntity.getLastName();
		this.email = userEntity.getEmail();
		this.phoneNumber = userEntity.getPhoneNumber();
	}
	
	
	
	
	
	
	

}
