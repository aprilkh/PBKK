package com.april.transportationapp;

public class BicycleTransportation implements Transportation{
	private Wheel wheel;
	private String name;
	private String email;
	
	@Override
	public void getRideTransportation() {
		//TODO Auto-Generated mehod stub
		System.out.println("Ride for 5 km!");
	}
	
	public BicycleTransportation(Wheel wheel, String name, String email) {
		super();
		this.wheel = wheel;
		this.name = name;
		this.email = email;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
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
