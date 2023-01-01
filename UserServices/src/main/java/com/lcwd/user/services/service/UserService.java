package com.lcwd.user.services.service;

import java.util.List;

import com.lcwd.user.services.enities.User;

public interface UserService {
	
	
	//Create all operations related to users
	
	//Create User
	
	User saveUser(User user);
	
	
	//get User with the given user Id
	
	User getUser(int userId);
	
	//get all User
	
	List<User> getAllUser();

}
