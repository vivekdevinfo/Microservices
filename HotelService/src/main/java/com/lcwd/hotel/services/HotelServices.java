package com.lcwd.hotel.services;

import java.util.List;

import com.lcwd.hotel.entities.Hotel;

public interface HotelServices {

	
	//create
	
	Hotel createHotel(Hotel hotel);
	
	//get all hotel Details
	
	List<Hotel> getAll();
	
	
	//get Single
	
	Hotel get(int id);
}
