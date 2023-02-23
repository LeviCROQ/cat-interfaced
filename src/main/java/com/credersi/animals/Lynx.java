package com.credersi.animals;

public class Lynx extends Animal implements Purr, Sleep, Speak {
	public Lynx() {	}
	
	public int purr() {
		return 30;
	}
	
	public boolean sleep() {
		return true;
	}
	
	public String speak(String sentence) {
		return(sentence + ", said the Lynx");
	}
}