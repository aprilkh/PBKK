package com.april.transportationconfig;

import org.springframework.beans.factory.annotation.Value;

public class BusTransportation implements Transportation {
	
	private Wheel wheel;
	@Value("${test.name}")
	private String name;
	@Value("${test.color}")
	private String color;
	
	public BusTransportation(Wheel wheel, String name, String color) {
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


	public void setColor(String color) {
		this.color = color;
	}


	public BusTransportation(Wheel wheel) {
		this.wheel = wheel;
	}


	public Wheel getWheel() {
		return wheel;
	}


	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}

	@Override
	public String getRideTransportation() {
		// TODO Auto-generated method stub
		return "Ride for 3 km";
	}
}
