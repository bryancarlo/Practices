package com.lab2;

public class Test {

	public static void main(String[] args) {
		Car car1 = new Car("v8", "red");
		Car car2 = new Car("v6", "blue");
		
		//System.out.println(car1.color); ERROR: private, not visible!
		System.out.println(car1.getColor());
		System.out.println(car2.getColor());
		
	}

}
