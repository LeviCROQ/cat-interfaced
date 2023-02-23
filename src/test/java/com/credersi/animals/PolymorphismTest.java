package com.credersi.animals;

import static org.junit.Assert.*;

import org.junit.Test;

public class PolymorphismTest {

	private String speakNow(Speak speaker, String msg) {
		return speaker.speak(msg);
		
	}
	
	@Test
	public void testPoly() {
		Speak gorilla = new Gorilla();
		Speak lynx = new Lynx();
		
		assertEquals(this.speakNow(gorilla, "Hey dude"), "Hey dude, said the Gorilla");
		assertEquals(this.speakNow(lynx, "Wassup"), "Wassup, said the Lynx");
		
	}

}
