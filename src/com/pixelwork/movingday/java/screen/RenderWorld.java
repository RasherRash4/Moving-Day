package com.pixelwork.movingday.java.screen;

import com.pixelwork.movingday.java.assets.Chunk;
import com.pixelwork.movingday.java.assets.tiles.Tile;

public class RenderWorld {
	private RenderEngine renderengine;
	
	public RenderWorld(RenderEngine renderengine) {
		this.renderengine = renderengine;
	}
	
	public void renderChunk(Chunk chunk) {
		for(int l = 0; l < Chunk.LAYERS; l++) {
			for(int x = 0; x < Chunk.WIDTH; x++) {
				for(int y = 0; y < Chunk.HEIGHT; y++) {
					Tile currentTile = chunk.getTile(x, y, l);
					
					if(currentTile != null) {
						int[] tPos = new int[2];
						tPos[0] = (currentTile.textureindex % 32);
						tPos[1] = (currentTile.textureindex / 32);
						
						int tX = x * 8;
						int tY = y * 8;
						
						this.renderengine.render.renderImage(currentTile.scale, tPos, tX, tY);
					}
				}
			}
		}
	}
}