package com.archieruin.starroad.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.archieruin.starroad.Main;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.resizable = false;
		config.title = Main.TITLE;
		config.width = Main.WIDTH * 2;
		config.height = Main.HEIGHT * 2;
		config.fullscreen = true;
		new LwjglApplication(new Main(), config);
	}
}
