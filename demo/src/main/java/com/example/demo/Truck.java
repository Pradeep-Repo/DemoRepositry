package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Truck {

	@GetMapping("/truck")
	public String test() {
		return "truck";
	}
	
	@GetMapping("/minitruck")
	public String minitruck() {
		return "minitruck";
	}
	
	@GetMapping("/microtruck")
	public String microtruck() {
		return "minitruck";
	}
}