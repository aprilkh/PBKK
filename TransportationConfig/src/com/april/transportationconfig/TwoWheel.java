package com.april.transportationconfig;

import org.springframework.stereotype.Component;

@Component
public class TwoWheel implements Wheel{
	@Override
	public String getWheels() {
		return "Transportation has two wheels";
	}
	
}
