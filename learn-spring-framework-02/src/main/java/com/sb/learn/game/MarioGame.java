package com.sb.learn.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("marioGame")
public class MarioGame implements GamingConsole{
	@Override
	public void up() {
		System.out.println("Jump");
	}
	@Override
	public void down() {
		System.out.println("Go in to a hole");
	}
	@Override
	public void left() {
		System.out.println("Go back");
	}
	@Override
	public void right() {
		System.out.println("Accelerate");
	}
}
