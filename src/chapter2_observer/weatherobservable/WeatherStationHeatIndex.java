package chapter2_observer.weatherobservable;

public class WeatherStationHeatIndex {

  public static void main(final String[] args) {
    final WeatherData weatherData = new WeatherData();
    final CurrentConditionsDisplay currentConditions = new CurrentConditionsDisplay(weatherData);
    final StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
    final ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
    final HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

    weatherData.setMeasurements(80, 65, 30.4f);
    weatherData.setMeasurements(82, 70, 29.2f);
    weatherData.setMeasurements(78, 90, 29.2f);
  }
}
