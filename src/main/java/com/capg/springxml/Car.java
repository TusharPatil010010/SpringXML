package com.capg.springxml;

public class Car {
	
	String color;
	Engine engine;
	
	public Car(Engine engine) {
		this.engine = engine;
	}
	
	public Car(String color) {
		this.color = color;
	}
	
	public void showColor() {
		System.out.println("Car color is : " + color);
	}

	public void start() {
		 System.out.println("Car has been started");
	}
}
