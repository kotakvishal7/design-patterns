package com.vishal.quack;

// Quacking behavior implementation for ducks that do not QUACK.

public class MuteQuack implements QuackBehavior {

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("Silence");
	}

}
