package com.pixelwork.movingday.java.world;

public class WorldGenerator {
	public Level level;
	public Generator generator;
	
	public WorldGenerator(Generator generator) {
		this.level = new Level(generator.levelWidth, generator.levelHeight);
		this.generator = generator;
	}
}