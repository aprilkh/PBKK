package com.april.transportationconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {
	public static void main(String[] args) {
		// Create IoC 
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TransportationConfig.class);
		
		BusTransportation transportation = context.getBean("busTransportation", BusTransportation.class);
		
		System.out.println(transportation.getRideTransportation());
		System.out.println(transportation.getColor());
		
		context.close();

	}


}
