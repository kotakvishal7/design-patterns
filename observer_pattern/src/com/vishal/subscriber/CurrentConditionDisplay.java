package com.vishal.subscriber;

import com.vishal.publisher.Subject;

public class CurrentConditionDisplay implements Observer, DisplayElement {

	// Here the Subject (Publisher) is being maintained because we might want to unregister
	// and having the state of the Subject is helpful.
	private Subject subject;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public CurrentConditionDisplay(Subject subject) {
		this.subject = subject;
		subject.registerObserver(this);
	}
	
	// The below method updates the current state of temperature, humidity and pressure
	// and displays it on the screen
	@Override
	public void update(float temperature, float humidity, float pressure) {
		// TODO Auto-generated method stub
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}

	// This method just prints out the latest temperature, humidity and pressure
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Temperature is " + temperature + "\t Humidity is " + humidity + "\t Pressure is " + pressure);
	}

}
