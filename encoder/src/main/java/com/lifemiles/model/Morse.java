package com.lifemiles.model;

import java.util.HashMap;

public class Morse extends Code {
	
	
	public Morse() {
		this.codigo = new HashMap<String, String>();
		codigo.put("a", ".-");
		codigo.put("b", "-...");
		codigo.put("c", "-.-.");
		codigo.put("d", "-..");
		codigo.put("e", ".");
		codigo.put("f", "..-.");
		codigo.put("g", "--.");
		codigo.put("h", "....");
		codigo.put("i", "..");
		codigo.put("j", ".---");
		codigo.put("k", "-.-");
		codigo.put("l", ".-..");
		codigo.put("m", "--");
		codigo.put("n", "-.");
		codigo.put("o", "---");
		codigo.put("p", ".--.");
		codigo.put("q", "--.-");
		codigo.put("r", ".-.");
		codigo.put("s", "...");
		codigo.put("t", "-");
		codigo.put("u", "..-");
		codigo.put("v", "...-");
		codigo.put("w", ".--");
		codigo.put("x", "-..-");
		codigo.put("y", "-.--");
		codigo.put("z", "--..");
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
