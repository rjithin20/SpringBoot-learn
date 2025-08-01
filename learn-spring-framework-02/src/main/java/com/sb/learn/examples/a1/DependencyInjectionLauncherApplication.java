package com.sb.learn.examples.a1;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class YourBusinessClass{
	
//	Field injection - dependency is injected using reflection
	Dependency1 dependency1;
	
	Dependency2 dependency2;
	
	//spring team recommends constructor injection
	//constructor injection using constructor
	//@Autowired is not mandatory for constructor injection
	public YourBusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
		super();
		System.out.println("Contructor Injection - YourBusinessClass");
		this.dependency1 = dependency1;
		this.dependency2 = dependency2;
	}

	//setter injection using setter methods
//	@Autowired
//	public void setDependency1(Dependency1 dependency1) {
//		System.out.println("Setter Injection - setDependency1");
//		this.dependency1 = dependency1;
//	}
//
//	@Autowired
//	public void setDependency2(Dependency2 dependency2) {
//		System.out.println("Setter Injection - setDependency2");
//		this.dependency2 = dependency2;
//	}

	public String toString() { 
		return "Using " + dependency1 + " and " + dependency2;
	} 
}

@Component
class Dependency1{
} 

@Component
class Dependency2{
}


@Configuration
@ComponentScan //scan in the current package
public class DependencyInjectionLauncherApplication {

	public static void main(String[] args) {
		try(var context = 
				new  AnnotationConfigApplicationContext
				(DependencyInjectionLauncherApplication.class)){
			Arrays.stream(context.getBeanDefinitionNames())
			.forEach(System.out::println);
			System.out.println(context.getBean(YourBusinessClass.class));
		}
	}
}