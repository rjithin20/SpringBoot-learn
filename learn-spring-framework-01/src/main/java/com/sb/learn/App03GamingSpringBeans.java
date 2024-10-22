package com.sb.learn;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sb.learn.game.GameRunner;
import com.sb.learn.game.GamingConsole;

public class App03GamingSpringBeans {

	public static void main(String[] args) {
		
		try(var context = 
				new  AnnotationConfigApplicationContext
				(GamingConfiguration.class)){
			
//			launching the game and game runner as spring beans
			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
		}
	}
}
