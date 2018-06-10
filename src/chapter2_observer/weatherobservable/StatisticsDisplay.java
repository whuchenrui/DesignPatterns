package chapter2_observer.weatherobservable;

import java.util.Observable;
import java.util.Observer;

public class StatisticsDisplay implements Observer, DisplayElement {
  private float maxTemp = 0.0f;
  private float minTemp = 200;
  private float tempSum= 0.0f;
  private int numReadings;

  public StatisticsDisplay(final Observable observable) {
    observable.addObserver(this);
  }

  @Override
  public void update(final Observable observable, final Object arg) {
    if (observable instanceof WeatherData) {
      final WeatherData weatherData = (WeatherData)observable;
      final float temp = weatherData.getTemperature();
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
  }

  @Override
  public void display() {
    System.out.println("Avg/Max/Min temperature = " + (this.tempSum / this.numReadings)
      + "/" + this.maxTemp + "/" + this.minTemp);
  }
}
