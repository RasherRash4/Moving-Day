package com.pixelwork.movingday.java.world;

import com.pixelwork.movingday.java.assets.Chunk;

public class Level {
	private Chunk[][] chunks;
	
	public Level(int width, int height) {
		this.chunks = new Chunk[width][height];
	}
	
	public void addChunk(int x, int y) {
		this.chunks[x][y] = new Chunk();
	}
	
	public void removeChunk(int x, int y) {
		this.chunks[x][y] = null;
	}
	
	public Chunk getChunk(int x, int y) {
		return this.chunks[x][y];
	}
}