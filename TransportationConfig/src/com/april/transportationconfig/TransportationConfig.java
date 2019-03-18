package com.april.transportationconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//Config job : IoC + Dependency Injection

@Configuration
@ComponentScan("com.april.transportationconfig")
@PropertySource("classpath:sport.properties")

public class TransportationConfig {
	//IoC
		//Create object
		@Bean
		public Transportation busTransportation() {
			BusTransportation myBusTransportation = new BusTransportation(wheel());
			return myBusTransportation;
		}
		
		@Bean
		public Wheel wheel() {
			return new ThreeWheel();
		}
		
//		@Bean
//		public Transportation busTransportation(Wheel wheel) {
//			BusTransportation myBusTransportation2 = new BusTransportation(twoWheel());
//			return myBusTransportation2;
//		}
}
