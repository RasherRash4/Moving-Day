package com.pixelwork.movingday.client;

import java.awt.Dimension;

import javax.swing.JFrame;

import com.pixelwork.movingday.java.screen.Screen;
import com.pixelwork.movingday.java.world.Generator;

public class MovingDay {
	public static final int RESOLUTIONX = 286;
	public static final int RESOLUTIONY = 186;
	
	private static final int SCALE = 3;
	
	public static final int WIDTH = RESOLUTIONX * SCALE;
	public static final int HEIGHT = RESOLUTIONY * SCALE;
	
	public static final String TITLE = "Moving Day";
	
	public static int[] VERSION = new int[3];
	public static String VERSION_TITLE = null;
	
	public static Generator GENERATOR;
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		
		frame.setTitle(TITLE);
		
		VERSION[0] = 0;
		VERSION[1] = 0;
		VERSION[2] = 1;
		
		VERSION_TITLE = "alpha " + VERSION[0] + "." + VERSION[1] + "." + VERSION[2];
		
		Screen screen = new Screen();
		GENERATOR = new Generator();
		
		frame.add(screen);
		frame.pack();
		
		frame.setSize(new Dimension(WIDTH, HEIGHT));
		frame.setFocusable(true);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		screen.initBuffers();
		
		screen.start();
	}
}