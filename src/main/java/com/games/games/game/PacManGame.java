package com.games.games.game;

import org.springframework.stereotype.Component;

@Component
public class PacManGame implements GamingConsole{
	public void up() {
		System.out.println("Up");
	}
	public void down() {
		System.out.println("down");
	}
	public void left() {
		System.out.println("left");
	}
	public void right() {
		System.out.println("right");
	}

}
