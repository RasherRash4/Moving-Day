package com.pixelwork.movingday.java.screen;

public class CullManager {
	private RenderEngine renderengine;
	public Camera camera;
	
	public CullManager(RenderEngine renderengine) {
		this.renderengine = renderengine;
		this.camera = new Camera(this);
	}
}