package com.pixelwork.movingday.client;

import java.awt.Dimension;

import javax.swing.JFrame;

public class MovingDay {
	public static final int RESOLUTIONX = 210;
	public static final int RESOLUTIONY = 156;
	
	private static final int SCALE = 3;
	
	public static final int WIDTH = RESOLUTIONX * SCALE;
	public static final int HEIGHT = RESOLUTIONY * SCALE;
	
	public static final String TITLE = "Moving Day";
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		
		frame.setTitle(TITLE);
		
		frame.setSize(new Dimension(WIDTH, HEIGHT));
		frame.setFocusable(true);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}