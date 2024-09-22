package com.sb.learn;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

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
		return new Person(name(), age(), address2());
	}
	
	@Bean
	public Person person3Parameters(String name, int age, Address address3) {
		return new Person(name, age, address3);
	}
	
	@Bean
	@Primary
	public Person person4Parameters(String name, int age, Address address) {
		return new Person(name, age, address);
	}
	
	@Bean
	public Person person5Qualifier(String name, int age, 		@Qualifier("address3qualfier")Address address) {
		return new Person(name, age, address);
	}


	@Bean(name = "address3")
	@Qualifier("address3qualfier")
	public Address address3() {
		return new Address("OTP", 25);
	}
	
	@Bean(name = "address2")
	@Primary
	public Address address2() {
		return new Address("Amb", 7);
	}
}
