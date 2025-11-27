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
	private int nextID = 0;
	public int[] pos = new int[2];
	
	public Chunk() {
		this.tiles = new Tile[WIDTH][HEIGHT][LAYERS];
		this.entities = new ArrayList<>();
	}
	
	public void setTile(int x, int y, int layer, Tile newTile) {
		boolean canSet = x < WIDTH && x >= 0 && layer < LAYERS && layer >= 0;
		
		if(canSet) {
			if(newTile == null) {
				this.tiles[x][y][layer] = null;
			}else {
				Tile copyCat = newTile.makeCopy();
				
				this.tiles[x][y][layer] = copyCat;
			}
		}else {
			throw new IllegalArgumentException("Too high or low of a layer, or x, y coordinate");
		}
	}
	
	public Tile getTile(int x, int y, int layer) {
		return this.tiles[x][y][layer];
	}
	
	public List<Entity> getEntities() {
		return this.entities;
	}
	
	public void addEntity(double[] pos, Entity entity) {
		Entity copyCat = entity.Copy();
		
		copyCat.position = pos;
		copyCat.wid = this.nextID;
		this.nextID++;
		
		this.entities.add(copyCat);
	}
	
	public void delEntity(Entity entity) {
		this.entities.remove(entity);
	}
	
	public Entity getEntity(double[] pos) {
		for(Entity currentEntity : this.entities) {
			if(currentEntity.position[0] == pos[0] && currentEntity.position[1] == pos[1]) {
				return currentEntity;
			}
		}
		
		return null;
	}
	
	public Entity getEntity(int id) {
		for(Entity currentEntity : this.entities) {
			if(currentEntity.wid == id) {
				return currentEntity;
			}
		}
		
		return null;
	}
}