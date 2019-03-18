package com.april.transportationconfig;

public class BusTransportation implements Transportation {
	
	private Wheel wheel;
	
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
