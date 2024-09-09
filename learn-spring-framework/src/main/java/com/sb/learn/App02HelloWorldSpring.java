package com.sb.learn;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sb.learn.game.GameRunner;
import com.sb.learn.game.MarioGame;
import com.sb.learn.game.PacmanGame;
import com.sb.learn.game.SuperContraGame;

public class App02HelloWorldSpring {
	public static void main(String[] args) {
		
		//	1. launch a spring context
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

		//	2. configure the things that we want spring to manage - @Configuration
		// HelloWorldConfiguration -  @Configuration
		//name - @Bean (method with @Bean annotation)
		
		//	3. Retrieving beans managed by spring
		System.out.println(context.getBean("name"));
	}
}
