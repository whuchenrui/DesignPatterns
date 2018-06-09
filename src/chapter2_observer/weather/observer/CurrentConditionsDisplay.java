package chapter2_observer.weather.observer;

import chapter2_observer.weather.subject.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
	private float temperature;
	private float humidity;
	private final Subject weatherData;
	
	public CurrentConditionsDisplay(final Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	@Override
	public void update(final float temperature, final float humidity, final float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}
	
	@Override
	public void display() {
		System.out.println("Current conditions: " + temperature
			+ "F degrees and " + humidity + "% humidity");
	}
}
