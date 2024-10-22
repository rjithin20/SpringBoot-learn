package com.sb.learn;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.sb.learn.game.GameRunner;
import com.sb.learn.game.GamingConsole;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("com.sb.learn.game") // will scan for spring components in that particular package
public class App03GamingSpringBeans {

	@Bean
	public GameRunner gameRunner(GamingConsole game) {
		System.out.println("Parameter : " + game);
		var gameRunner = new GameRunner(game);
		return gameRunner;
	}
	public static void main(String[] args) {
		try(var context = 
				new  AnnotationConfigApplicationContext
				(App03GamingSpringBeans.class)){
//			launching the game and game runner as spring beans
			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
		}
	}
}

//spring has created an instance of the Pacman game and auto wire it in to the Gaming console
