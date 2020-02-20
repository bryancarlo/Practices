package com.lab2;

public class Suv extends Car{
	double fuelCapacity;
	
	public Suv(String engine, String color, double capacity) {
		super(engine, color);
		this.fuelCapacity = capacity; 
	}
	
	public void setFuelCapacity(double fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}
	
	public double getFuelCapacity() {
		return fuelCapacity;
	}
	
	public void driveOffRoad(double distance) {
		System.out.println("This SUV can drive offroad up to a distance  of " + distance + " kms                                                                                                                                                                      .");
	}
}
