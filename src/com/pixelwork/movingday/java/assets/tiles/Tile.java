package com.pixelwork.movingday.java.assets.tiles;

public class Tile {
	public static final Tile[] tileList = new Tile[512];
	
	public static final Tile test = new Tile(0, 0).Scale(1, 1).setSize(1, 1);
	
	public final int id;
	public int textureindex;
	public int[] size = new int[2];
	public int[] scale = new int[2];
	public boolean collidable;
	public int rid;
	
	protected Tile(int newID, int newTexture) {
		if(tileList[newID] != null) {
			throw new IllegalArgumentException("Tile already exists");
		}else {
			this.id = newID;
			this.textureindex = newTexture;
			tileList[newID] = this;
		}
	}
	
	private Tile() {
		this.id = -1;
	}
	
	protected Tile setSize(int width, int height) {
		this.size[0] = width;
		this.size[1] = height;
		return this;
	}
	
	protected Tile Scale(int width, int height) {
		this.scale[0] = width;
		this.scale[1] = height;
		return this;
	}
	
	protected Tile canCollide(boolean arg0) {
		this.collidable = arg0;
		return this;
	}
	
	public Tile makeCopy() {
		Tile newCopy = new Tile();
		
		newCopy.rid = this.id;
		newCopy.canCollide(this.collidable);
		newCopy.setSize(this.size[0], this.size[1]);
		newCopy.Scale(this.scale[0], this.scale[1]);
		newCopy.textureindex = this.textureindex;
		
		return newCopy;
	}
}