package com.pixelwork.movingday.java.assets.types.entities;

import com.pixelwork.movingday.java.assets.entities.Entity;

public class EntityType {
	public static final EntityType none = new EntityType().setSpecialType(0).isAi(false);
	public static final EntityType player = new EntityTypePlayer().setSpecialType(1).isAi(false);
	public static final EntityType item = new EntityTypeItem().setSpecialType(2).isAi(false);
	
	private int type;
	private boolean hasAi;
	
	public void movement(double[] args, Entity arg0) {
		
	}
	
	public void think(double[] args, Entity arg1) {
		
	}
	
	public EntityType setSpecialType(int type) {
		this.type = type;
		return this;
	}
	
	public EntityType isAi(boolean ai) {
		this.hasAi = ai;
		return this;
	}
}