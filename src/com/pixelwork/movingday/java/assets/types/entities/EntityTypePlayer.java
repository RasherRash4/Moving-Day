package com.pixelwork.movingday.java.assets.types.entities;

import com.pixelwork.movingday.java.assets.entities.Entity;

public class EntityTypePlayer extends EntityType {
	private int speed = 100;
	
	@Override
	public void movement(double[] args, Entity arg0) {
		double dt = args[4];
		
		if(args[0] == 0.1) {
			arg0.position[0] -= speed * dt;
		}else if(args[1] == 0.2) {
			arg0.position[1] -= speed * dt;
		}else if(args[2] == 0.3) {
			arg0.position[1] += speed * dt;
		}else if(args[3] == 0.4) {
			arg0.position[0] += speed * dt;
		}
	}
	
	@Override
	public void think(double[] args, Entity arg0) {
		
	}
}