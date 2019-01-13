package com.vishal.fly;

// Flying behavior implementation for ducks that do NOT fly (like
// rubber ducks and decoy ducks).

public class FlyNoWay implements FlyBehavior {

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("I can't fly.");
	}

}
