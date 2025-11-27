package com.pixelwork.movingday.java.assets.types.tiles;

public class TileType {
	public TileType none = new TileType().setType(0).canDrop(true).setHealth(10);
	
	private int specialtype;
	private boolean candrop;
	private int health;
	
	public TileType setType(int type) {
		this.specialtype = type;
		return this;
	}
	
	public TileType canDrop(boolean drops) {
		this.candrop = drops;
		return this;
	}
	
	public TileType setHealth(int health) {
		this.health = health;
		return this;
	}
}