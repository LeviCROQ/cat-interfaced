package com.credersi.animals;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CatTest {
	@Test
	public void testInitialState() {
		Cat cat = new Cat();
		assertTrue(cat.isAlive());
		assertEquals(cat.howHungry(), 50);
	}
	
	@Test
	public void testPurr() {
		Cat cat = new Cat();
		Lynx lynx = new Lynx();
		
		assertTrue(cat.isAlive());
		assertTrue(lynx.isAlive());
		
		
		assertEquals(cat.purr(), 25);
		assertEquals(lynx.purr(), 30);
	}
	
	@Test
	public void testHowl() {
		Wolf wolf = new Wolf();
		assertTrue(wolf.isAlive());
		assertEquals(wolf.howl(), 40);	
	}
	
	@Test
	public void testSign() {
		Gorilla gorilla = new Gorilla();
		assertTrue(gorilla.isAlive());
		assertTrue(gorilla.sign());
	}
	
	@Test
	public void testSleep() {
		Cat cat = new Cat();
		Wolf wolf = new Wolf();
		Gorilla gorilla = new Gorilla();
		Lynx lynx = new Lynx();
		
		assertTrue(cat.isAlive());
		assertTrue(wolf.isAlive());
		assertTrue(gorilla.isAlive());
		assertTrue(lynx.isAlive());
		
		assertFalse(cat.sleep());
		assertFalse(wolf.sleep());
		assertFalse(gorilla.sleep());
		assertTrue(lynx.sleep());
	}
	
	@Test
	public void testSpeak() {
		Gorilla gorilla = new Gorilla();
		Lynx lynx = new Lynx();
		
		assertTrue(gorilla.isAlive());
		assertTrue(lynx.isAlive());
		
		assertEquals(gorilla.speak("Howdy folk"), "Howdy folk, said the Gorilla");
		assertEquals(lynx.speak("Sup"), "Sup, said the Lynx");
		
	}
}