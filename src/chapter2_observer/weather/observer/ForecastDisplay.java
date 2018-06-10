package chapter2_observer.weather.observer;

import chapter2_observer.weather.subject.WeatherData;

public class ForecastDisplay implements Observer, DisplayElement {
  private float currentPressure = 29.92f;
  private float lastPressure;
  private final WeatherData weatherData;

  public ForecastDisplay(final WeatherData weatherData) {
    this.weatherData = weatherData;
    weatherData.registerObserver(this);
  }

  @Override
  public void update(final float temp, final float humidity, final float pressure) {
    this.lastPressure = this.currentPressure;
    this.currentPressure = pressure;

    this.display();
  }

  @Override
  public void display() {
    System.out.print("Forecast: ");
    if (this.currentPressure > this.lastPressure) {
      System.out.println("Improving weather on the way!");
    } else if (this.currentPressure == this.lastPressure) {
      System.out.println("More of the same");
    } else if (this.currentPressure < this.lastPressure) {
      System.out.println("Watch out for cooler, rainy weather");
    }
  }
}
