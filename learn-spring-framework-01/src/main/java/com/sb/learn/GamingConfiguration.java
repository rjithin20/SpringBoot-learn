package com.sb.learn;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sb.learn.game.GameRunner;
import com.sb.learn.game.GamingConsole;
import com.sb.learn.game.PacmanGame;

@Configuration
public class GamingConfiguration {
	
//	creating a Pacman game
	@Bean
	public GamingConsole game() {
		var game = new PacmanGame();
		return game;
	}
	
//	wiring it in to a GameRunner
	@Bean
	public GameRunner gameRunner(GamingConsole game) {
		var gameRunner = new GameRunner(game);
		return gameRunner;
	}
}
