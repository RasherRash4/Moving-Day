package com.pixelwork.movingday.java.world;

public class WorldGenerator {
	public Level level;
	private Generator generator;
	
	public void setUp() {
		for(int x = 0; x < this.generator.levelWidth; x++) {
			for(int y = 0; y < this.generator.levelHeight; y++) {
				this.level.addChunk(x, y);
			}
		}
	}
	
	public WorldGenerator(Generator generator) {
		this.level = new Level(generator.levelWidth, generator.levelHeight);
		this.generator = generator;
	}
}