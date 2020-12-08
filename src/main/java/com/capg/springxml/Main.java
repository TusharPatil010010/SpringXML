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
		
		/*
		 * Example of loose coupling using bean Engine key = (Engine)
		 * ac.getBean("engine"); new Keys().run(key);
		 */
		
		//DI using setter method
		Bike bike = ac.getBean("bike", Bike.class);
		bike.showColor();
	}
}
