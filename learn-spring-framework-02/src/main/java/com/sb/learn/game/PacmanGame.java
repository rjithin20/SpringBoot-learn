package com.sb.learn.game;

import org.springframework.stereotype.Component;

// instance of this Pacman game will be created by Spring

@Component //now this is a component that spring will manage
public class PacmanGame implements GamingConsole{

	@Override
	public void up() {
		System.out.println("up");
	}

	@Override
	public void down() {
		System.out.println("down");
	}

	@Override
	public void left() {
		System.out.println("left");
	}

	@Override
	public void right() {
		System.out.println("right");
	}

}
