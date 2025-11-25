package com.pixelwork.movingday.java.assets.entities;

public class Entity {
	public int health;
	public double[] position = new double[2];
	public int textureindex;
	public int[] offset = new int[2];
	
	public void Copy() {
		Entity newCopy = new Entity();
	}
}