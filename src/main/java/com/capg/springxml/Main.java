package com.capg.springxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class Keys{
	
	public void run(Engine key) {
		key.start();
	}
}

public class Main{
	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");		

		  Bike bike = ac.getBean("bike", Bike.class);
		  bike.start();

		  Car car = ac.getBean("car", Car.class);
		  car.start();
		  
	}
}
