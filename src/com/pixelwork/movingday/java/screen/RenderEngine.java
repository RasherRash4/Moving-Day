package com.pixelwork.movingday.java.screen;

public class RenderEngine {
	public Screen screen;
	public Render render;
	public RenderTile render_tile;
	public TextureHandler texturehandler;
	
	public RenderEngine(Screen screen) {
		this.screen = screen;
		this.texturehandler = new TextureHandler(this);
		this.render = new Render(this);
		this.render_tile = new RenderTile(this);
	}
}