package com.lcwd.hotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lcwd.hotel.entities.Hotel;
import com.lcwd.hotel.services.HotelServices;

@RestController
@RequestMapping("/hotels")
public class HotelController {
	
	@Autowired
	private HotelServices hotelServices;
	
	//create
	
	@PostMapping
	public ResponseEntity<Hotel> create(@RequestBody Hotel hotel)
	{
		Hotel createdHotel = this.hotelServices.createHotel(hotel);
		return ResponseEntity.status(HttpStatus.CREATED).body(createdHotel);
	}
   
	@GetMapping("/{id}")
	public ResponseEntity<Hotel> get(@PathVariable int id)
	{
		 Hotel hotel = this.hotelServices.get(id);
		 
		 return ResponseEntity.ok(hotel);
	}
	
	public ResponseEntity<List<Hotel>> getAll()
	{
		 List<Hotel> allHotels = this.hotelServices.getAll();
		 return ResponseEntity.ok(allHotels);
	}

}
