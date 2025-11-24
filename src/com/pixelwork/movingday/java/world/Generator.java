package com.pixelwork.movingday.java.world;

public class Generator {
	public WorldGenerator worldgenerator;
	public static final int levelWidth = 3;
	public static final int levelHeight = 3;
	
	public Generator() {
		this.worldgenerator = new WorldGenerator(this);
	}
}