package com.april.transportationapp;

public class BicycleTransportation implements Transportation{
	private Wheel wheel;
	private String name;
	private String color;
	
	@Override
	public void getRideTransportation() {
		//TODO Auto-Generated mehod stub
		System.out.println("Ride for 5 km!");
	}
	
	public BicycleTransportation(Wheel wheel, String name, String color) {
		super();
		this.wheel = wheel;
		this.name = name;
		this.color = color;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setEmail(String color) {
		this.color = color;
	}
	
	public BicycleTransportation() {
		
	}
	
	public BicycleTransportation(Wheel wheel) {
		this.wheel = wheel;
	}
	
	public Wheel getWheel() {
		return wheel;
	}
	
	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}
}
