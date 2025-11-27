package com.pixelwork.movingday.java.font;

public class FontProcessor {
	public String[] getLetters(String arg0) {
		int stringLength = arg0.length();
		String[] toReturn = new String[stringLength];
		arg0.toLowerCase();
		
		for(int i = 0; i < stringLength; i++) {
			char letter = arg0.charAt(i);
			String toAdd = Character.toString(letter);
			
			toReturn[i] = toAdd;
		}
		
		return toReturn;
	}
}