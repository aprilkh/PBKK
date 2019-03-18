package com.april.transportationann;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
	public static void main(String[] args) {
		//Create IoT Container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("notationconfig.xml");
		
		// Get Bean
		Transportation transportation = context.getBean("truckTransportation", Transportation.class);
		TruckTransportation two = context.getBean("truckTransportation", TruckTransportation.class);
		
		System.out.println(transportation.getRideTransportation());
		System.out.println(two.getWheel().getWheels());
		
		context.close();

	}

}
