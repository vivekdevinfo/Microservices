package com.lcwd.rating.services;

import java.util.List;

import com.lcwd.rating.entities.Rating;

public interface RatingService {

	//create
    
	public Rating createRating(Rating rating);
	
	//get all rating
	
	public List<Rating> getRatings();
	
	//get all rating by userId
	
	public List<Rating> getRatingByUserId(int userId);
	
	
	//get all rating by hotel 
	
	public List<Rating> getRatingByHotelId(int hotelId);
}
