package com.pixelwork.movingday.java.screen;

public class RenderEngine {
	public Screen screen;
	public Render render;
	public TextureHandler texturehandler;
	
	public RenderEngine(Screen screen) {
		this.texturehandler = new TextureHandler(this);
		this.render = new Render(this);
	}
}