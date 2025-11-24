package com.pixelwork.movingday.java.world;

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
	}
}