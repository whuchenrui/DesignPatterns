package chapter2_observer.weather.observer;

import chapter2_observer.weather.subject.WeatherData;

public class StatisticsDisplay implements Observer, DisplayElement {
  private float maxTemp = 0.0f;
  private float minTemp = 200;
  private float tempSum= 0.0f;
  private int numReadings;
  private final WeatherData weatherData;

  public StatisticsDisplay(final WeatherData weatherData) {
    this.weatherData = weatherData;
    weatherData.registerObserver(this);
  }

  @Override
  public void update(final float temp, final float humidity, final float pressure) {
    this.tempSum += temp;
    this.numReadings++;

    if (temp > this.maxTemp) {
      this.maxTemp = temp;
    }
 
    if (temp < this.minTemp) {
      this.minTemp = temp;
    }

    this.display();
  }

  @Override
  public void display() {
    System.out.println("Avg/Max/Min temperature = " + (this.tempSum / this.numReadings)
      + "/" + this.maxTemp + "/" + this.minTemp);
  }
}
