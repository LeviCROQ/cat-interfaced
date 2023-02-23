package com.credersi.animals;

public class Gorilla extends Animal implements Sign, Sleep, Speak {
	
	public boolean sign() {
		return true;
	}

	public boolean sleep() {
		return false;
	}
	
	public String speak(String sentence) {
		return(sentence + ", said the Gorilla");
	}
}
