package com.capg.springxml;

class Keys{
	
	public void run(Engine key) {
		key.start();
	}
}

public class Main{
	public static void main(String[] args) {
		Engine key = new Car();
		new Keys().run(key);
	}
}
