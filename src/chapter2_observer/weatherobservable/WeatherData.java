package chapter2_observer.weatherobservable;

import java.util.Observable;

public class WeatherData extends Observable {
  private float temperature;
  private float humidity;
  private float pressure;

  public WeatherData() { }

  public void measurementsChanged() {
    this.setChanged();
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
