package com.vishal.main;

import com.vishal.fly.FlyBehavior;
import com.vishal.quack.QuackBehavior;

public abstract class Duck {
	
	
	// Declaring two reference variables for the behavior interface types
	// All duck subclasses (in the same package) inherit these
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public Duck() {
		
	}
	
	public abstract void display();
	
	
	// Delegating to the behavior class
	public void performFly() {
		flyBehavior.fly();
	}
	
	public void performQuack() {
		quackBehavior.quack();
	}
	
	public void swim() {
		System.out.println("All ducks float, even decoys.");
	}
	
}
