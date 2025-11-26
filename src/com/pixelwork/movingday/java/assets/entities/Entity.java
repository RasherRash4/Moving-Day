package com.pixelwork.movingday.java.assets.entities;

import com.pixelwork.movingday.java.assets.types.entities.EntityType;

public class Entity {
	public int health, maxhealth;
	public double[] position = new double[2];
	public int textureindex;
	public int[] offset = new int[2];
	public EntityType type;
	public int wid;
	
	public Entity Copy() {
		Entity newCopy = new Entity();
		
		newCopy.maxhealth = this.maxhealth;
		newCopy.health = this.maxhealth;
		newCopy.textureindex = this.textureindex;
		newCopy.offset[0] = this.offset[0];
		newCopy.offset[1] = this.offset[1];
		newCopy.type = this.type;
		
		return newCopy;
	}
}