package com.pixelwork.movingday.java.screen;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;

public class TextureHandler {
	public RenderEngine renderengine;
	private BufferedImage sheet = null;
	private BufferedImage[][] textureList = new BufferedImage[32][32];
	private int spotSize = 8;
	
	public BufferedImage getImage(String arg0) {
		BufferedImage toReturn = null;
		InputStream imageFile = getClass().getResourceAsStream(arg0);
		
		try {
			toReturn = ImageIO.read(imageFile);
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		return toReturn;
	}
	
	public BufferedImage getTexture(int x, int y, int width, int height) {
		BufferedImage toReturn = new BufferedImage(width * 8, height * 8, BufferedImage.TYPE_INT_ARGB);
		Graphics g = toReturn.getGraphics();
		
		for(int xx = 0; xx < width; xx++) {
			for(int yy = 0; yy < height; yy++) {
				int currentX = x + xx;
				int currentY = x + yy;
				BufferedImage toDraw = this.textureList[currentX][currentY];
				
				g.drawImage(toDraw, xx * 8, yy * 8, null);
			}
		}
		
		return toReturn;
	}
	
	public TextureHandler(RenderEngine renderengine) {
		this.renderengine = renderengine;
		this.sheet = getImage("/sheet.png");
		
		for(int x = 0; x < 32; x++) {
			for(int y = 0; y < 32; y++) {
				this.textureList[x][y] = this.sheet.getSubimage(x * 8, y * 8, spotSize, spotSize);
			}
		}
	}
}