package com.pixelwork.movingday.java.assets;

import java.util.ArrayList;
import java.util.List;

import com.pixelwork.movingday.java.assets.entities.Entity;
import com.pixelwork.movingday.java.assets.tiles.Tile;

public class Chunk {
	public static final int WIDTH = 16;
	public static final int HEIGHT = 16;
	public static final int LAYERS = 3;
	
	private Tile[][][] tiles;
	private List<Entity> entities;
	
	public Chunk() {
		this.tiles = new Tile[WIDTH][HEIGHT][LAYERS];
		this.entities = new ArrayList<>();
	}
	
	public void setTile(int x, int y, int layer, Tile newTile) {
		if(newTile == null) {
			this.tiles[x][y][layer] = null;
		}else {
			Tile copyCat = newTile.makeCopy();
			
			this.tiles[x][y][layer] = copyCat;
		}
	}
	
	public Tile getTile(int x, int y, int layer) {
		return this.tiles[x][y][layer];
	}
	
	public List<Entity> getEntities() {
		return this.entities;
	}
	
	public void addEntity(double[] pos, Entity entity) {
		
	}
}