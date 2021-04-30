package com.lifemiles.implementations;
import java.util.ArrayList;
import java.util.List;

import com.lifemiles.interfaces.Encoder;
import com.lifemiles.model.Binario;
import com.lifemiles.model.Code;
import com.lifemiles.model.Morse;
import com.lifemiles.model.Murcielago;

public class EncoderImpl implements Encoder {
	List<Code> lstEncoders = new ArrayList<>();
	
    
	public EncoderImpl () {

        //if we need more encoders we can add here the new extended Code class
		lstEncoders.add(new Morse());
		lstEncoders.add(new Binario());
		lstEncoders.add(new Murcielago());
	}
	
    public void encode(String text){
    	for (Code code : lstEncoders) {
			System.out.format( "%s (%s) \n",code.encode(text.toLowerCase()),code.getClass().toString().replace("class com.lifemiles.model.", ""));
		}
    }
}