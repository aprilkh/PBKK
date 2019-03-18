package com.april.transportationann;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component("myTruckTransportation")

//Default bean ID : truckTransportation
@Component
public class TruckTransportation implements Transportation{
	//dependency injection using field directly
	@Autowired
	@Qualifier ("databaseWheel")
	private Wheel wheel;
	
	public TruckTransportation() {
	}
		
	//dependency injection using constructor
	//@Autowired
	public TruckTransportation(Wheel wheel) {
		this.wheel = wheel;
	}
	
	public Wheel getWheel() {
		return wheel;
	}
	
	//dependency injection using setter / mutator
	//@Autowired
	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}

	@Override
	public String getRideTransportation() {
		// TODO Auto-generated method stub
		return "Ride your Transportation";
	}

	public Wheel getWheels() {
		// TODO Auto-generated method stub
		return null;
	}

}
