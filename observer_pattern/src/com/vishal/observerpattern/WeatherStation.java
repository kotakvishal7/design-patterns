package com.vishal.observerpattern;

import com.vishal.publisher.WeatherData;
import com.vishal.subscriber.CurrentConditionDisplay;

/*
 * Observable pattern is the design pattern where there are objects with a 
 * one-to-many relationship and when one object changes it's state all the 
 * dependent object are notified and updated automatically.
 * Analogy: Newspaper
 * 
 */

public class WeatherStation {

	public static void main(String args[]) {
		
		// Creating the WeatherData Object to maintain the state of temperature, humidity and pressure
		WeatherData weatherData = new WeatherData();
		
		// Creating the display for showing the current status of temperature, humidity and pressure
		CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
		
		// Simulating weather measurements
		weatherData.setMeasurements(80, 65, 30);
		weatherData.setMeasurements(81, 66, 31);
		weatherData.setMeasurements(82, 67, 32);
	}
}

