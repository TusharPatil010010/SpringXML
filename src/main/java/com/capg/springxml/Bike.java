package com.capg.springxml;

public class Bike implements Engine {

	@Override
	public void start() {
		System.out.println("Bike has been started");		
	}
	
	String color;
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void showColor() {
		System.out.println("Bike color is : " + color);
	}

}
