package com.vishal.strategypattern;

import com.vishal.quack.*;
import com.vishal.fly.*;

public class MallardDuck extends Duck {

	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I'm a Mallard duck");
	}

}
