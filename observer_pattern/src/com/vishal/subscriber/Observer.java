package com.vishal.subscriber;


// All Observers need to implement the interface so that they can update their state
public interface Observer {

	// The parameters are the state values which the Observers get 
	// from the Subject when a weather measurement changes.
	public void update(float temperature, float humidity, float pressure);
}
