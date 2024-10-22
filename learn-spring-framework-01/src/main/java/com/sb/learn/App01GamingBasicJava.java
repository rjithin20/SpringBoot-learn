package com.sb.learn;

import com.sb.learn.game.GameRunner;
import com.sb.learn.game.MarioGame;
import com.sb.learn.game.PacmanGame;
import com.sb.learn.game.SuperContraGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
//		var game = new MarioGame();
//		var game = new SuperContraGame();
		var game = new PacmanGame();
		var gameRunner = new GameRunner(game);
		gameRunner.run();
	}

}
