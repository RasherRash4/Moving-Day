package com.pixelwork.movingday.java.font;

import com.pixelwork.movingday.java.screen.RenderEngine;

public class FontEngine {
	public RenderFont render_font;
	public RenderEngine renderengine;
	public FontProcessor fontprocessor;
	
	public FontEngine(RenderEngine renderengine) {
		this.renderengine = renderengine;
		this.fontprocessor = new FontProcessor();
		this.render_font = new RenderFont(this);
	}
}