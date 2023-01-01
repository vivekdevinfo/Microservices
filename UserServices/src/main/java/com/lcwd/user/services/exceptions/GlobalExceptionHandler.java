package com.lcwd.user.services.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.lcwd.user.services.payload.ApiResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {

	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ApiResponse> handlerResourceNotFoundException(ResourceNotFoundException ex)
	{
		String message = ex.getMessage();
	    ApiResponse apiResponse=new ApiResponse();
	    apiResponse.setMessage(message);
	    apiResponse.setSuccess(true);
	    
	    return new ResponseEntity<ApiResponse>(apiResponse,HttpStatus.NOT_FOUND);
	    
	}
}
