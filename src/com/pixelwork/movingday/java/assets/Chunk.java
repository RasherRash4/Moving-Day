package com.pixelwork.movingday.java.assets;

import com.pixelwork.movingday.java.assets.tiles.Tile;

public class Chunk {
	public static final int WIDTH = 16;
	public static final int HEIGHT = 16;
	public static final int LAYERS = 3;
	
	private Tile[][][] tiles;
	
	public Chunk() {
		this.tiles = new Tile[WIDTH][HEIGHT][LAYERS];
	}
	
	public void setTile(int x, int y, int layer, Tile newTile) {
		
	}
}