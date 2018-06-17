package com.example.demo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Car {

	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int engine;

	public int getEngine() {
		return engine;
	}

	public void setEngine(int engine) {
		this.engine = engine;
	}

	
	
	
}
