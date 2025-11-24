package com.pixelwork.movingday.java.screen;

public class RenderEngine {
	public Render render;
	
	public RenderEngine(Screen screen) {
		this.render = new Render(screen);
	}
}