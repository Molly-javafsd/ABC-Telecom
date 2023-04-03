package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.User;
import com.example.demo.model.UserType;

public interface UserRepository extends JpaRepository<User, Integer>{

	@Query("FROM User WHERE name=?1 and password = ?2 and usertype=?3") 
	public User getUserByUsernameAndPaswordAndRole(String name, String password, UserType usertype);
}
