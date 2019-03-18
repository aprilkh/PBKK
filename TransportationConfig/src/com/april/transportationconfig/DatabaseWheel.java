package com.april.transportationconfig;

import org.springframework.stereotype.Component;

@Component
public class DatabaseWheel implements Wheel{
	
	@Override
	public String getWheels() {
		return "Database";
	}

}
