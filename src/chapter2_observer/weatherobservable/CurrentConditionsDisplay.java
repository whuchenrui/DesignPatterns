package chapter2_observer.weatherobservable;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
  Observable observable;
  private float temperature;
  private float humidity;

  public CurrentConditionsDisplay(final Observable observable) {
    this.observable = observable;
    observable.addObserver(this);
  }

  @Override
  public void update(final Observable obs, final Object arg) {
    if (obs instanceof WeatherData) {
      final WeatherData weatherData = (WeatherData)obs;
      this.temperature = weatherData.getTemperature();
      this.humidity = weatherData.getHumidity();
      this.display();
    }
  }

  @Override
  public void display() {
    System.out.println("Current conditions: " + this.temperature
      + "F degrees and " + this.humidity + "% humidity");
  }
}
