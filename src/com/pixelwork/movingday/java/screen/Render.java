package com.pixelwork.movingday.java.screen;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

import com.pixelwork.movingday.client.MovingDay;
import com.pixelwork.movingday.java.assets.Chunk;

public class Render {
	private RenderEngine renderengine;
	
	private BufferedImage CANVAS = new BufferedImage(MovingDay.RESOLUTIONX, MovingDay.RESOLUTIONY, BufferedImage.TYPE_INT_ARGB);
	
	public Render(RenderEngine renderengine) {
		this.renderengine = renderengine;
	}
	
	public void renderImage(int[] size, int[] pos, int x, int y) {
		BufferedImage toRender = this.renderengine.texturehandler.getTexture(pos[0], pos[1], size[0], size[1]);
		Graphics g = CANVAS.getGraphics();
		
		g.drawImage(toRender, x, y, null);
	}
	
	public void paint() {
		BufferStrategy bs = this.renderengine.screen.getBufferStrategy();
		
		Graphics g = CANVAS.getGraphics();
		
		g.setColor(new Color(0, 0, 0));
		g.fillRect(0, 0, MovingDay.RESOLUTIONX, MovingDay.RESOLUTIONY);
		
		Chunk toRender = MovingDay.GENERATOR.worldgenerator.level.getChunk(0, 0);
		this.renderengine.render_world.renderChunk(toRender);
		
		g = bs.getDrawGraphics();
		g.drawImage(CANVAS, 0, 0, MovingDay.WIDTH, MovingDay.HEIGHT, null);
		
		g.dispose();
		
		bs.show();
	}
}