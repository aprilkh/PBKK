package com.april.transportationapp;

public class CarTransportation implements Transportation {
	@Override
	public void getRideTransportation() {
		//TODO Auto-generated method stub
		System.out.println("Ride a Car!");
	}
	
	private Wheel wheel;
	
	public CarTransportation() {
	}
	
	public CarTransportation(Wheel wheel) {
		this.wheel = wheel;
	}
	
	public Wheel getWheel() {
		return wheel;
	}
	
	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}
}
