package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.exception.NotImplementedException;
import com.example.exception.UserNotFoundException;

@RestController
public class TestErrorController {

	@GetMapping ("show404")
	public String show404() {
		
		throw new UserNotFoundException("sample 400");
		
	}
	
	@GetMapping ("/show500")
	public String show500() {
		
		throw new NotImplementedException("sample 500");
		
	}
}
