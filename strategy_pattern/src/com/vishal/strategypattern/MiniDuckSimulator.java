package com.vishal.strategypattern;

import com.vishal.fly.FlyRocketPowered;

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
		
		Duck modelDuck = new ModelDuck();
		
		// This performFly method will execute the fly method of the FlyNoWay behavior
		// of flyBehavior as it was assigned during the instantiation.
		modelDuck.performFly();
		
		// This invokes the model's inherited setter method and the duck suddenly has
		// rocket-powered flying capability.
		modelDuck.setFlyBehavior(new FlyRocketPowered());
		
		
		// Now the duck has rocket-powered flying behavior
		modelDuck.performFly();
	}
}
