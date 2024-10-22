package com.sb.learn.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sb.learn.game.GameRunner;
import com.sb.learn.game.MarioGame;
import com.sb.learn.game.PacmanGame;
import com.sb.learn.game.SuperContraGame;

public class App02HelloWorldSpring {
	public static void main(String[] args) {
		
		//	1. launch a spring context
		
//		try with resources
		try(var context = 
				new AnnotationConfigApplicationContext
					(HelloWorldConfiguration.class)){
//			2. configure the things that we want spring to manage - @Configuration
			// HelloWorldConfiguration -  @Configuration
			//name - @Bean (method with @Bean annotation)
			
			//	3. Retrieving beans managed by spring
//			System.out.println(context.getBean("name"));
//			System.out.println(context.getBean("age"));
//			System.out.println(context.getBean("height"));
			
			System.out.println(context.getBean("person"));
//			System.out.println(context.getBean("address2"));
			System.out.println(context.getBean("p2"));//person3MethodCall
			System.out.println(context.getBean("person3Parameters"));//person3Parameters
			
			System.out.println(context.getBean("person5Qualifier"));
		}
	}
}
