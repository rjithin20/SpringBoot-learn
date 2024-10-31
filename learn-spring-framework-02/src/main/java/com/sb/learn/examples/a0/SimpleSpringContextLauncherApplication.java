package com.sb.learn.examples.a0;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.sb.learn.examples.a1") // will scan for spring components in that particular package
public class SimpleSpringContextLauncherApplication {

	public static void main(String[] args) {
		try(var context = 
				new  AnnotationConfigApplicationContext
				(SimpleSpringContextLauncherApplication.class)){
			Arrays.stream(context.getBeanDefinitionNames())
			.forEach(System.out::println);
		}
	}
}