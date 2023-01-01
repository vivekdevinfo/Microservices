package com.lcwd.hotel.exception;

public class ResourceNotFoundException extends RuntimeException {

	public ResourceNotFoundException() {
		// TODO Auto-generated constructor stub
		super("Resource not found !!");
	}
	public ResourceNotFoundException(String message)
	{
		super(message);
	}
	
}
