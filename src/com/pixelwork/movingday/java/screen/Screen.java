package com.pixelwork.movingday.java.screen;

import java.awt.Canvas;

public class Screen extends Canvas implements Runnable {
	public RenderEngine screenRenderEngine;
	
	private static final long serialVersionUID = 1L;
	private boolean running = false;
	
	public void initBuffers() {
		this.requestFocus();
		
		this.createBufferStrategy(3);
	}
	
	public void start() {
		this.screenRenderEngine = new RenderEngine(this);
		
		running = true;
		new Thread(this).start();
	}
	
	@Override
	public void run() {
		long lasttime = System.nanoTime();
		double delta;
		double fpsCalc = 1000000000.0 / 60.0;
		while(running) {
			long currenttime = System.nanoTime();
			delta = (currenttime - lasttime) / 1000000000.0;
			lasttime = currenttime;
			
			update(delta);
			
			this.screenRenderEngine.render.paint();
			
			long now = System.nanoTime();
			long frameTime = now - currenttime;
			long sleepTime = (long) fpsCalc - frameTime;
			if(sleepTime > 0) {
				try {
					Thread.sleep(sleepTime / 1000000);
				}catch(InterruptedException e) {
					Thread.currentThread().interrupt();
				}
			}
		}
	}
	
	private void update(double dt) {
		
	}
}