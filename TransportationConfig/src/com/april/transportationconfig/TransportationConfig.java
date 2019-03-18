package com.april.transportationconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySources;

//Config job : IoC + Dependency Injection

@Configuration
@PropertySources("classpath:sport.properties")

public class TransportationConfig {
	//IoC
		//Create object
		@Bean
		public Transportation BusTransportation() {
			BusTransportation myBusTransportation = new BusTransportation();
			return myBusTransportation;
		}
		
		@Bean
		public Transportation busTransportation(Wheel wheel) {
			BusTransportation myBusTransportation2 = new BusTransportation(twoWheel());
			return myBusTransportation2;
		}
}
