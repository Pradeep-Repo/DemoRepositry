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
		return "MINITRUCK";
	}
	
	@GetMapping("/microtruck")
	public String microtruck() {
		return "MICROTRUCK";
	}
	
	@GetMapping("/megatruck")
	public String megatruck() {
		return "MEGATRUCK";
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