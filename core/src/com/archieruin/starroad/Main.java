package com.archieruin.starroad;

import com.archieruin.starroad.screens.GameScreen;
import com.archieruin.starroad.controllers.PlayerInput;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;

public class Main extends Game {

	public static final String TITLE = "Star Road";
//	public static final int WIDTH = 480;
//	public static final int HEIGHT = 320;
	public static final int WIDTH = 128;
	public static final int HEIGHT = 128;

	@Override
	public void create () {
		GameScreen gameScreen = new GameScreen();
		this.setScreen(gameScreen);
	}

	@Override
	public void render () {
		super.render();
	}
	
	@Override
	public void dispose () {
		super.dispose();
	}
}
