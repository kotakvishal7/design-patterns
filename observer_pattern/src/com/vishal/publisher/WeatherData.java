package com.vishal.publisher;

import java.util.ArrayList;
import java.util.List;

import com.vishal.subscriber.Observer;


// WeatherData implements the Subject (Publisher) interface
public class WeatherData implements Subject {

	// The below list holds the list of observers subscribed to the Subject
	private List<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		observers = new ArrayList<Observer>();
	}
	
	// When a new Observer registers, we just add it to the end of the list
	@Override
	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.add(o);
	}
	
	
	// When an Observer wants to unsubscribe, we just find it's position and remove
	// it from the list
	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		int index = observers.indexOf(o);
		if(index >= 0) {
			observers.remove(index);
		}
	}

	// Below we notify all the Observers. Since all the Observers implement the 
	// Observer interface, we know they will have an implementation of update
	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for(Observer o : observers) {
			o.update(temperature, humidity, pressure);
		}
	}
	
	// We notify all Observers when we get an update from the Weather Station
	public void measurementsChanges() {
		notifyObservers();
	}
	
	// The Weather station can update the parameters using the below method and
	// notify all the Observers about this change
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanges();
	}

}
