package com.capg.springxml;

public class Bike {
	
	String color;
	Engine engine;
	
	public Bike(Engine engine) {
		this.engine = engine;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void showColor() {
		System.out.println("Bike color is : " + color);
	}
	
	public void start() {
		 System.out.println("Bike has been started");
	}

}
