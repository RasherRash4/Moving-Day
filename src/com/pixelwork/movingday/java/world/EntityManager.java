package com.pixelwork.movingday.java.world;

import java.util.ArrayList;
import java.util.List;

import com.pixelwork.movingday.java.assets.entities.Entity;

public class EntityManager {
	private static List<Entity> entityContainer = new ArrayList<>();
	private static int nextID = 0;
	
	public static void entityAdded(Entity entity) {
		entity.cid = nextID;
		nextID++;
		entityContainer.add(entity);
	}
	
	public static Entity getEntity(int id) { // Reccomended to get an entity inside a chunk instead of the entity container
		for(Entity currentEntity : entityContainer) {
			if(currentEntity.cid == id) {
				return currentEntity;
			}
		}
		
		return null;
	}
}