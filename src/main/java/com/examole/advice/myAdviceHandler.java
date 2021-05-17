package com.examole.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.exception.NotImplementedException;
import com.example.exception.UserNotFoundException;
import com.example.model.ErrorType;

@ControllerAdvice
public class myAdviceHandler {
	
	
	
	@ExceptionHandler(com.example.exception.NotImplementedException.class)
	@ResponseBody
	public ResponseEntity<ErrorType> NotImplementedException(NotImplementedException excp){
		
		return new ResponseEntity<ErrorType>(
				new ErrorType(excp.getMessage(),"NO SAMPLE FOUND","DATA FORMAT ERROR","CHECK DATA"), 
				HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(com.example.exception.UserNotFoundException.class)
	@ResponseBody	
	public ResponseEntity<ErrorType> UserNotFoundException(UserNotFoundException excp){
		
		return new ResponseEntity<ErrorType>(
				new ErrorType(excp.getMessage(),"NO USER FOUND","USER FORMAT ERROR","USER DATA"), 
				HttpStatus.NOT_ACCEPTABLE);
	}
	
	
	
}
