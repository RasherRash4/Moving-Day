package com.pixelwork.movingday.java.screen;

public class RenderEngine {
	public Screen screen;
	public Render render;
	public RenderWorld render_world;
	public TextureHandler texturehandler;
	
	public RenderEngine(Screen screen) {
		this.screen = screen;
		this.texturehandler = new TextureHandler(this);
		this.render = new Render(this);
		this.render_world = new RenderWorld(this);
	}
}