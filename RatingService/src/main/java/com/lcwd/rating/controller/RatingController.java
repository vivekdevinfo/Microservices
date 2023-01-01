package com.lcwd.rating.controller;

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

import com.lcwd.rating.entities.Rating;
import com.lcwd.rating.services.RatingService;

@RestController
@RequestMapping("/ratings")
public class RatingController {
	
	@Autowired
	private RatingService ratingService;
	
	//create
	
	@PostMapping
	public ResponseEntity<Rating> create(@RequestBody Rating rating)
	{
	     Rating createRating = ratingService.createRating(rating);	
	     return ResponseEntity.status(HttpStatus.CREATED).body(createRating);
	}
	
	//getAll
	@GetMapping
	public ResponseEntity<List<Rating>> getRatings()
	{
		return ResponseEntity.ok(ratingService.getRatings());
	}
	
	//getRatingByUserId
	
	@GetMapping("/{userId}")
	public ResponseEntity<List<Rating>> getRatingsByUserId(@PathVariable int userId)
	{
		return ResponseEntity.ok(ratingService.getRatingByUserId(userId));
	}
	
	// GetRatingByHotelId
     @GetMapping("/{hotelId}")
	public ResponseEntity<List<Rating>> getRatingsByHotelId(@PathVariable int hotelId) {
		return ResponseEntity.ok(ratingService.getRatingByHotelId(hotelId));
	}
	

}
