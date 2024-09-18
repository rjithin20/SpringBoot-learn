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
	public Person person2MethodCall() {
		return new Person(name(), age(), address());
	}
	
	@Bean(name = "p3")
	public Person person3Parameters(String name, int age, Address address3) {
		return new Person(name, age, address3);
	}

	@Bean(name = "address3")
	public Address address3() {
		return new Address("OTP", 25);
	}
	
	@Bean(name = "address2")
	public Address address() {
		return new Address("Amb", 7);
	}
}
