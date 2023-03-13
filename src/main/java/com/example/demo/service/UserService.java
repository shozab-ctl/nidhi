package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.User;
import com.example.demo.repositories.UserRepository;

@Service
public class UserService {
	
//	//web.xml -> <bean>
//	<delpe>
	@Autowired
	private UserRepository userRepo;
	
	public List<User> getAll(){
		List<User> listOfUser = userRepo.findAll();
		return listOfUser;
	}
	
}
