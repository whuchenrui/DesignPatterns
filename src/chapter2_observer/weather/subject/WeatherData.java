package chapter2_observer.weather.subject;

import chapter2_observer.weather.observer.Observer;

import java.util.ArrayList;

public class WeatherData implements Subject {
  private final ArrayList<Observer> observers;
  private float temperature;
  private float humidity;
  private float pressure;

  public WeatherData() {
    this.observers = new ArrayList<>();
  }

  @Override
  public void registerObserver(final Observer o) {
    this.observers.add(o);
  }

  @Override
  public void removeObserver(final Observer o) {
    final int i = this.observers.indexOf(o);
    if (i >= 0) {
      this.observers.remove(i);
    }
  }

  @Override
  public void notifyObservers() {
    for (final Observer observer : this.observers) {
      observer.update(this.temperature, this.humidity, this.pressure);
    }
  }

  public void measurementsChanged() {
    this.notifyObservers();
  }

  public void setMeasurements(final float temperature, final float humidity, final float pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;
    this.measurementsChanged();
  }

  public float getTemperature() {
    return this.temperature;
  }

  public float getHumidity() {
    return this.humidity;
  }

  public float getPressure() {
    return this.pressure;
  }

}
