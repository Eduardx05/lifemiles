package com.lifemiles;

import com.lifemiles.implementations.EncoderImpl;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
    	EncoderImpl imp = new EncoderImpl();
    	imp.encode("Kennia");
    }
}
