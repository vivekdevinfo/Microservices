package com.lcwd.user.services.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lcwd.user.services.enities.User;

public interface UserRepository extends JpaRepository<User,Integer>{

	
	//if you want to implement any custom method so we can do that
}
