package com.lab2;

//public final class Car { makes it impotent; no subclass can be created from it
public class Car {
	
	private String engine;
	private String color;
	
	public Car(String engine, String color) {
		this.engine = engine;
		this.color = color;
	}
	
	//setters, getters

	public void setEngine(String engine) {
		this.engine = engine;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getEngine() {
		return this.engine;
	}
	public String getColor() {
		return this.color;
	}
	
	//Car Methods
	
	public void accelerate(double acc) {
		System.out.println("This car is accelerating at " + acc + " kph^2.");
	}

}
