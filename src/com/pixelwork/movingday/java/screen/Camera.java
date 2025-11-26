package com.pixelwork.movingday.java.screen;

import com.pixelwork.movingday.client.MovingDay;
import com.pixelwork.movingday.java.assets.tiles.Tile;

public class Camera {
	private CullManager cullmanager;
	public int[] position = new int[2];
	public static long CULLING_BLOCK = 1L;
	
	public Camera(CullManager cullmanager) {
		this.cullmanager = cullmanager;
		this.position[0] = 0;
		this.position[1] = 0;
	}
	
	public boolean checkCullingBlock(Tile tile, int[] position) {
		int lSide = this.position[0];
		int rSide = this.position[0] + MovingDay.RESOLUTIONX;
		int tSide = this.position[1];
		int bSide = this.position[1] + MovingDay.RESOLUTIONY;
		position[0] += this.position[0];
		position[1] += this.position[1];
		
		boolean isCullable = position[0] >= lSide && position[0] <= rSide && position[1] >= tSide && position[1] <= bSide;
		
		return isCullable;
	}
}