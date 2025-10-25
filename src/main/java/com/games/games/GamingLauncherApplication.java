package com.games.games;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.games.games.game.GameRunner;
import com.games.games.game.GamingConsole;
import com.games.games.game.MarioGame;
import com.games.games.game.PacManGame;
import com.games.games.game.SuperContraGame;

@Configuration
@ComponentScan("com.games.games.game")
public class GamingLauncherApplication {

	public static void main(String[] args) {

		try(var context = new AnnotationConfigApplicationContext(GamingLauncherApplication.class)){
			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
		}
	}
}
