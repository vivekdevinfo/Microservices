package com.lcwd.user.services.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lcwd.user.services.enities.User;
import com.lcwd.user.services.exceptions.ResourceNotFoundException;
import com.lcwd.user.services.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository userRepository;

	@Override
	public User saveUser(User user) {
//		String randomUserId = UUID.randomUUID().toString();
//		user.setUserId(randomUserId);
		return userRepository.save(user);
	}

	@Override
	public User getUser(int userId) {
		
		return userRepository.findById(userId).orElseThrow(()-> new ResourceNotFoundException("User not found on server with the user Id"+userId));
	}

	@Override
	public List<User> getAllUser() {
		
	return	userRepository.findAll();
	}
	
	

}
