package com.lcwd.rating.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lcwd.rating.entities.Rating;

public interface RatingRepository extends JpaRepository<Rating, Integer> {
	
	//Custom finder methods
	
	List<Rating> findByUserId(int userId);
	
	List<Rating> findByHotelId(int hotelId);

}
