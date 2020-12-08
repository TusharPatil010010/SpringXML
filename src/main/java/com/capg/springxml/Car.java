package com.capg.springxml;

public class Car implements Engine{

	@Override
	public void start() {
		 System.out.println("Car has been started");
	}
	
	String color;
	
	public Car(String color) {
		this.color = color;
	}
	
	public void showColor() {
		System.out.println("Car color is : " + color);
	}

}
