package com.vishal.main;

public class MiniDuckSimulator {

	public static void main(String args[]) {
		
		Duck mallardDuck = new MallardDuck();
		
		// This calls the Mallard Duck's inherited performFly() method, which then
		// delegates to the object's FlyBehavior (i.e. calls fly() on the duck's 
		// inherited flyBehavior reference)
		mallardDuck.performFly();
		
		// This calls the Duck's performQuack() method and references the Quack class
		// through the quackBehavior interface. 
		mallardDuck.performQuack();
	}
}
