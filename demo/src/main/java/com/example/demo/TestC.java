package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestC {

	@GetMapping("/test")
	public String test() {
		return "bhati bc";
	}
}
