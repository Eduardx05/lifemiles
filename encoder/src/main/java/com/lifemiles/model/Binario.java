package com.lifemiles.model;

import java.util.HashMap;

public class Binario extends Code {
	
	
	public Binario() {
		this.codigo = new HashMap<String, String>();
		codigo.put("a", "01000001");
		codigo.put("b", "01000010");
		codigo.put("c", "01000011");
		codigo.put("d", "01000100");
		codigo.put("e", "01000101");
		codigo.put("f", "01000110");
		codigo.put("g", "01000111");
		codigo.put("h", "01001000");
		codigo.put("i", "01001001");
		codigo.put("j", "01001010");
		codigo.put("k", "01001011");
		codigo.put("l", "01001100");
		codigo.put("m", "01001101");
		codigo.put("n", "01001110");
		codigo.put("o", "01001111");
		codigo.put("p", "01010000");
		codigo.put("q", "01010001");
		codigo.put("r", "01010010");
		codigo.put("s", "01010011");
		codigo.put("t", "01010100");
		codigo.put("u", "01010101");
		codigo.put("v", "01010110");
		codigo.put("w", "01010111");
		codigo.put("x", "01011000");
		codigo.put("y", "01011001");
		codigo.put("z", "01011010");
	}

	@Override
	public String encode(String text) {
		String textCode = "";
		
		for (char c : text.toCharArray()) {
			textCode = textCode+codigo.get(String.valueOf(c))+' ';
		}
		return textCode;
	}
	
	
	
}
