package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.*;
import com.example.demo.entities.User;


//JPA 

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	
	
////	"select * from tableName"; /sql
//	List<User> findAll(); //JPA
//	
//// "select * from tableName where firstName = "Nidhi""
//	User findByFirstName(String firstName);
//	
//	native , JPA query, JPQL
//	
//	User findByAddress_Lane(int no);
	
	

}
