package com.april.transportationapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
	public static void main(String[] args) {
		//IoC container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appconfig.xml");
		
		
		//retrieve
		Transportation transportation = context.getBean("myTransportation", Transportation.class);
		transportation.getRideTransportation();
		
		BicycleTransportation bicycleTransportation = (BicycleTransportation)transportation;
		System.out.println(bicycleTransportation.getWheel().getWheels());
		System.out.println(bicycleTransportation.getName());
		System.out.println(bicycleTransportation.getColor());
		
		//bean scope
		BicycleTransportation transportation1 = context.getBean("myTransportation", BicycleTransportation.class);
		BicycleTransportation transportation2 = context.getBean("myTransportation", BicycleTransportation.class);
		System.out.println("transportation 1 : " + transportation1);
		System.out.println("transportation 2 : " + transportation2);
		
		transportation2.setName("Diganti");
		System.out.println("transportation 1 : " + transportation1.getName());
		System.out.println("transportation 2 : " + transportation2.getName());
		
		//bean scope : prototype
		BicycleTransportation transportation3 = context.getBean("myTransportation", BicycleTransportation.class);
		BicycleTransportation transportation4 = context.getBean("myTransportation", BicycleTransportation.class);
		System.out.println("transportation 3 : " + transportation3);
		System.out.println("transportation 4 : " + transportation4);
		
		transportation3.setName("Bukan test");
		System.out.println("transportation 3 : " + transportation3.getName());
		System.out.println("transportation 4 : " + transportation4.getName());
		
		//Close IoC container
		context.close();
	}
}
