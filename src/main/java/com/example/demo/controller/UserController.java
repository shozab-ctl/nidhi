package com.example.demo.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.entities.User;
import com.example.demo.model.UserResponse;
import com.example.demo.service.UserService;

public class UserController {
	
	@Autowired
	private UserService userService;

	
	//getAll fetch all users
//	get - HTTP Method
	
	
	@GetMapping("/getAll")
	public ResponseEntity<List<UserResponse>> getAllUsers() {
		List<User> list = userService.getAll();

		List<UserResponse> response = list.stream().map(UserResponse::new).collect(Collectors.toList());

		if (!response.isEmpty())
			return new ResponseEntity<List<UserResponse>>(response, HttpStatus.OK);
		else
			return new ResponseEntity<List<UserResponse>>(HttpStatus.NO_CONTENT);

	}
	
	//getOne fetch one user
	//get - Http method
	
	//edit/update user
	// PUT API - 
	// POST
	// UPDATE
	
	//add user
	
	//delete user
	
	
//	POST
	
	
	
	//PUT
//	 USER
//	  id = 1;
//	 name = Shozab
//			 phoneNumber= 9718466647 / phoneNumber= 9718466646
//			 
//			 alter table clumn(phoneNumber)
//			 
//			 
//			 // POST
//			 USER
//			  id = 2;
//			 name = Shozab
//					 phoneNumber= 9718466646
//					 
//					 Insert (c1, c2 , c3) value ();
//					 
//					 // Update
//					 USER
//					  id = 2;
//					 name = Shozab
//							 phoneNumber= 9718466646
//							 alter table (c1, c2 , c3) value ();	 
//							 
}
