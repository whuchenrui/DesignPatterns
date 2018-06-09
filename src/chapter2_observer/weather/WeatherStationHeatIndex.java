package chapter2_observer.weather;

import chapter2_observer.weather.observer.CurrentConditionsDisplay;
import chapter2_observer.weather.observer.ForecastDisplay;
import chapter2_observer.weather.observer.HeatIndexDisplay;
import chapter2_observer.weather.observer.StatisticsDisplay;
import chapter2_observer.weather.subject.WeatherData;

public class WeatherStationHeatIndex {

	public static void main(final String[] args) {
		final WeatherData weatherData = new WeatherData();
		final CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		final StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		final ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		final HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
	}
}
