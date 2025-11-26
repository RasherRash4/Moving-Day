package com.pixelwork.movingday.java.world;

import com.pixelwork.movingday.java.assets.Chunk;
import com.pixelwork.movingday.java.assets.tiles.Tile;

public class WorldGenerator {
	public Level level;
	private Generator generator;
	
	public void setUp() {
		for(int x = 0; x < this.generator.levelWidth; x++) {
			for(int y = 0; y < this.generator.levelHeight; y++) {
				this.level.addChunk(x, y);
			}
		}
		
		Chunk toAdd = this.level.getChunk(0, 0);
		toAdd.setTile(0, 5, 0, Tile.test);
	}
	
	public WorldGenerator(Generator generator) {
		this.level = new Level(generator.levelWidth, generator.levelHeight);
		this.generator = generator;
	}
}