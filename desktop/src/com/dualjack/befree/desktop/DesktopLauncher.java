package com.dualjack.befree.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.dualjack.befree.BdxApp;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "BeFree";
		config.width = 800;
		config.height = 450;
		new LwjglApplication(new BdxApp(), config);
	}
}
