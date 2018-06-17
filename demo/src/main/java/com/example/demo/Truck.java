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
		return "microtruck";
	}
	
	@GetMapping("/megatruck")
	public String megatruck() {
		return "megatruck";
	}
	
	@GetMapping("/minicar")
	public String minicar() {
		return "minicar";
	}
	
	@GetMapping("/microcar")
	public String microcar() {
		return "microcar";
	}
	
	@GetMapping("/megacar")
	public String megacar() {
		return "megacar";
	}
}