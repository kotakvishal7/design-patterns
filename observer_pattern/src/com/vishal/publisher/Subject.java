package com.vishal.publisher;

import com.vishal.subscriber.Observer;

public interface Subject {

	// Add Observer to the list of Observers subscribing to the Subject (Publisher)
	public void registerObserver(Observer o);
	
	// Remove Observer from the list of Observers subscribing to the Subject (Publisher)
	public void removeObserver(Observer o);
	
	// Notifying Subject's state change to the Observers
	public void notifyObservers();
	
	
}
