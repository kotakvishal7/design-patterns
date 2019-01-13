package com.vishal.strategypattern;

import com.vishal.fly.FlyNoWay;
import com.vishal.quack.Quack;

public class ModelDuck extends Duck {

	// Model duck is a new type of duck in our simulator 
	// which has no way of flying
	
	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I'm a model duck");

	}

}
