package com.credersi.animals;

public class Wolf extends Animal implements Howl, Sleep {
	public Wolf() {	}

	public int howl() {
		return 40;
	}
	
	public boolean sleep() {
		return false;
	}
}