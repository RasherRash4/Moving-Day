package com.pixelwork.movingday.java.screen;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

import com.pixelwork.movingday.client.MovingDay;

public class Render {
	public Screen screen;
	
	private BufferedImage CANVAS = new BufferedImage(MovingDay.RESOLUTIONX, MovingDay.RESOLUTIONY, BufferedImage.TYPE_INT_ARGB);
	
	public Render(Screen screen) {
		this.screen = screen;
	}
	
	public void paint() {
		BufferStrategy bs = this.screen.getBufferStrategy();
		
		Graphics g = CANVAS.getGraphics();
		
		g.setColor(new Color(0, 0, 0));
		g.fillRect(0, 0, MovingDay.RESOLUTIONX, MovingDay.RESOLUTIONY);
		
		g = bs.getDrawGraphics();
		g.drawImage(CANVAS, 0, 0, MovingDay.WIDTH, MovingDay.HEIGHT, null);
		
		g.dispose();
		
		bs.show();
	}
}