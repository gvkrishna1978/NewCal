package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CalculatorApplication {


	@GetMapping("/")
	public String welcome() {
		return "Welcome to OpenShift... Venkata";
	}
	
	@GetMapping("/welcome")
	public String welcomePage() {
		return "welcome to Application";
	}
	
	/*
	 * @GetMapping("/error") public String errorPage() { return "error"; }
	 */
	
	public static void main(String[] args) {
		SpringApplication.run(CalculatorApplication.class, args);
	}

}
