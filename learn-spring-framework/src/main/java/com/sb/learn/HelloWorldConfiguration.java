package com.sb.learn;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age, Address add) {}; //record doesn't need getters and setters

//record for address
record Address(String place, int house_no) {};

@Configuration
public class HelloWorldConfiguration {

	@Bean
	public String name() {
		return "Jithin";
	}
	
	@Bean
	public int age() {
		return 23;
	}
	
//	@Bean
//	public float height() {
//		return 1.76f;
//	}
	
	@Bean
	public Person person() {
		return new Person("Dilu", 22, new Address("CHD", 777));
	}
	
	@Bean(name = "p2")
	public Person person2() {
		return new Person(name(), age(), address());
	}
	
	@Bean(name = "address2")
	public Address address() {
		return new Address("Amb", 7);
	}
}
