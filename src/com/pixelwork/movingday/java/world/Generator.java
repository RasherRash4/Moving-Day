package com.pixelwork.movingday.java.world;

import com.pixelwork.movingday.java.assets.Chunk;
import com.pixelwork.movingday.java.assets.tiles.Tile;

public class Generator {
	public WorldGenerator worldgenerator;
	public final int levelWidth = 3;
	public final int levelHeight = 3;
	
	public Generator() {
		this.worldgenerator = new WorldGenerator(this);
		
		this.setUp();
	}
	
	private void setUp() {
		this.worldgenerator.setUp();
		Chunk toAdd = this.worldgenerator.level.getChunk(0, 0);
		toAdd.setTile(0, 0, 1, Tile.test);
	}
}