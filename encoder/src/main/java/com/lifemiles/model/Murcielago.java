package com.lifemiles.model;

import java.util.HashMap;

public class Murcielago extends Code {
	
	
	public Murcielago() {
		this.codigo = new HashMap<String, String>();
		codigo.put("a", "7");
		codigo.put("b", "b");
		codigo.put("c", "3");
		codigo.put("d", "d");
		codigo.put("e", "5");
		codigo.put("f", "f");
		codigo.put("g", "8");
		codigo.put("h", "h");
		codigo.put("i", "4");
		codigo.put("j", "j");
		codigo.put("k", "k");
		codigo.put("l", "6");
		codigo.put("m", "0");
		codigo.put("n", "n");
		codigo.put("o", "9");
		codigo.put("p", "p");
		codigo.put("q", "q");
		codigo.put("r", "2");
		codigo.put("s", "s");
		codigo.put("t", "t");
		codigo.put("u", "1");
		codigo.put("v", "v");
		codigo.put("w", "w");
		codigo.put("x", "x");
		codigo.put("y", "y");
		codigo.put("z", "z");
	}

	@Override
	public String encode(String text) {
		String textCode = "";
		
		for (char c : text.toCharArray()) {
			textCode = textCode +codigo.get(String.valueOf(c));
		}
		return textCode;
	}
	
	
	
}
