package com.pixelwork.movingday.java.font;

public class RenderFont {
	private FontEngine fontengine;
	private int[] spotSize = new int[2];
	private int[] pos = new int[2];
	
	public RenderFont(FontEngine fontengine) {
		this.fontengine = fontengine;
		this.spotSize[0] = 1;
		this.spotSize[1] = 1;
		
		this.pos[1] = 30;
	}
	
	public void paint(String arg0, int x, int y) {
		String[] letters = this.fontengine.fontprocessor.getLetters(arg0);
		
		for(int i = 0; i < letters.length; i++) {
			int newX = x + (i * 8);
			
			if(letters[i].equals("a")) { this.pos[0] = 0; this.fontengine.renderengine.render.renderImage(this.spotSize, this.pos, newX, y); }
			if(letters[i].equals("b")) { this.pos[0] = 1; this.fontengine.renderengine.render.renderImage(this.spotSize, this.pos, newX, y); }
			if(letters[i].equals("c")) { this.pos[0] = 2; this.fontengine.renderengine.render.renderImage(this.spotSize, this.pos, newX, y); }
			if(letters[i].equals("d")) { this.pos[0] = 3; this.fontengine.renderengine.render.renderImage(this.spotSize, this.pos, newX, y); }
			if(letters[i].equals("e")) { this.pos[0] = 4; this.fontengine.renderengine.render.renderImage(this.spotSize, this.pos, newX, y); }
			if(letters[i].equals("f")) { this.pos[0] = 5; this.fontengine.renderengine.render.renderImage(this.spotSize, this.pos, newX, y); }
			if(letters[i].equals("g")) { this.pos[0] = 6; this.fontengine.renderengine.render.renderImage(this.spotSize, this.pos, newX, y); }
			if(letters[i].equals("h")) { this.pos[0] = 7; this.fontengine.renderengine.render.renderImage(this.spotSize, this.pos, newX, y); }
			if(letters[i].equals("i")) { this.pos[0] = 8; this.fontengine.renderengine.render.renderImage(this.spotSize, this.pos, newX, y); }
			if(letters[i].equals("j")) { this.pos[0] = 9; this.fontengine.renderengine.render.renderImage(this.spotSize, this.pos, newX, y); }
			if(letters[i].equals("k")) { this.pos[0] = 10; this.fontengine.renderengine.render.renderImage(this.spotSize, this.pos, newX, y); }
			if(letters[i].equals("l")) { this.pos[0] = 11; this.fontengine.renderengine.render.renderImage(this.spotSize, this.pos, newX, y); }
			if(letters[i].equals("m")) { this.pos[0] = 12; this.fontengine.renderengine.render.renderImage(this.spotSize, this.pos, newX, y); }
			if(letters[i].equals("n")) { this.pos[0] = 13; this.fontengine.renderengine.render.renderImage(this.spotSize, this.pos, newX, y); }
			if(letters[i].equals("o")) { this.pos[0] = 14; this.fontengine.renderengine.render.renderImage(this.spotSize, this.pos, newX, y); }
			if(letters[i].equals("p")) { this.pos[0] = 15; this.fontengine.renderengine.render.renderImage(this.spotSize, this.pos, newX, y); }
			if(letters[i].equals("q")) { this.pos[0] = 16; this.fontengine.renderengine.render.renderImage(this.spotSize, this.pos, newX, y); }
			if(letters[i].equals("r")) { this.pos[0] = 17; this.fontengine.renderengine.render.renderImage(this.spotSize, this.pos, newX, y); }
			if(letters[i].equals("s")) { this.pos[0] = 18; this.fontengine.renderengine.render.renderImage(this.spotSize, this.pos, newX, y); }
			if(letters[i].equals("t")) { this.pos[0] = 19; this.fontengine.renderengine.render.renderImage(this.spotSize, this.pos, newX, y); }
			if(letters[i].equals("u")) { this.pos[0] = 20; this.fontengine.renderengine.render.renderImage(this.spotSize, this.pos, newX, y); }
			if(letters[i].equals("v")) { this.pos[0] = 21; this.fontengine.renderengine.render.renderImage(this.spotSize, this.pos, newX, y); }
			if(letters[i].equals("w")) { this.pos[0] = 22; this.fontengine.renderengine.render.renderImage(this.spotSize, this.pos, newX, y); }
			if(letters[i].equals("x")) { this.pos[0] = 23; this.fontengine.renderengine.render.renderImage(this.spotSize, this.pos, newX, y); }
			if(letters[i].equals("y")) { this.pos[0] = 24; this.fontengine.renderengine.render.renderImage(this.spotSize, this.pos, newX, y); }
			if(letters[i].equals("z")) { this.pos[0] = 25; this.fontengine.renderengine.render.renderImage(this.spotSize, this.pos, newX, y); }
			
			this.pos[1] = 31;
			if(letters[i].equals("0")) { this.pos[0] = 9; this.fontengine.renderengine.render.renderImage(this.spotSize, this.pos, newX, y); }
			if(letters[i].equals("1")) { this.pos[0] = 0; this.fontengine.renderengine.render.renderImage(this.spotSize, this.pos, newX, y); }
			if(letters[i].equals("2")) { this.pos[0] = 1; this.fontengine.renderengine.render.renderImage(this.spotSize, this.pos, newX, y); }
			if(letters[i].equals("3")) { this.pos[0] = 2; this.fontengine.renderengine.render.renderImage(this.spotSize, this.pos, newX, y); }
			if(letters[i].equals("4")) { this.pos[0] = 3; this.fontengine.renderengine.render.renderImage(this.spotSize, this.pos, newX, y); }
			if(letters[i].equals("5")) { this.pos[0] = 4; this.fontengine.renderengine.render.renderImage(this.spotSize, this.pos, newX, y); }
			if(letters[i].equals("6")) { this.pos[0] = 5; this.fontengine.renderengine.render.renderImage(this.spotSize, this.pos, newX, y); }
			if(letters[i].equals("7")) { this.pos[0] = 6; this.fontengine.renderengine.render.renderImage(this.spotSize, this.pos, newX, y); }
			if(letters[i].equals("8")) { this.pos[0] = 7; this.fontengine.renderengine.render.renderImage(this.spotSize, this.pos, newX, y); }
			if(letters[i].equals("9")) { this.pos[0] = 8; this.fontengine.renderengine.render.renderImage(this.spotSize, this.pos, newX, y); }
			
			if(letters[i].equals(".")) { this.pos[0] = 10; this.fontengine.renderengine.render.renderImage(this.spotSize, this.pos, newX, y); }
			if(letters[i].equals(",")) { this.pos[0] = 11; this.fontengine.renderengine.render.renderImage(this.spotSize, this.pos, newX, y); }
			if(letters[i].equals("_")) { this.pos[0] = 12; this.fontengine.renderengine.render.renderImage(this.spotSize, this.pos, newX, y); }
			if(letters[i].equals("/")) { this.pos[0] = 14; this.fontengine.renderengine.render.renderImage(this.spotSize, this.pos, newX, y); }
			if(letters[i].equals("[")) { this.pos[0] = 15; this.fontengine.renderengine.render.renderImage(this.spotSize, this.pos, newX, y); }
			if(letters[i].equals("]")) { this.pos[0] = 16; this.fontengine.renderengine.render.renderImage(this.spotSize, this.pos, newX, y); }
			if(letters[i].equals("!")) { this.pos[0] = 17; this.fontengine.renderengine.render.renderImage(this.spotSize, this.pos, newX, y); }
			if(letters[i].equals("?")) { this.pos[0] = 18; this.fontengine.renderengine.render.renderImage(this.spotSize, this.pos, newX, y); }
			if(letters[i].equals("-")) { this.pos[0] = 19; this.fontengine.renderengine.render.renderImage(this.spotSize, this.pos, newX, y); }
			this.pos[1] = 30;
		}
	}
}