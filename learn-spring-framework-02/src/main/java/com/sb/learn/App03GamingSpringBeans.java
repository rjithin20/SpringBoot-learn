package com.sb.learn;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.sb.learn.game.GameRunner;
import com.sb.learn.game.GamingConsole;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.sb.learn.game.PacmanGame;

@Configuration
public class App03GamingSpringBeans {
	@Bean
	public GamingConsole game() {
		var game = new PacmanGame();
		return game;
	}
	@Bean
	public GameRunner gameRunner(GamingConsole game) {
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
