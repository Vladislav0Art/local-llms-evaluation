package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void testGetDate() {
        // Create sample weather data
        WeatherData weatherData = new WeatherData("2024-03-16", "Temperature: 25, Humidity: 60");

        // Verify the date is as expected
        assertEquals(16, weatherData.getDate());
    }

    @Test
    public void testGetWeatherDescription() {
        // Create sample weather data
        WeatherData weatherData = new WeatherData("2024-03-16", "Temperature: 25, Humidity: 60");

        // Verify the weather description is as expected
        assertEquals("Partly Cloudy", weatherData.getWeatherDescription());
    }

    @Test
    public void testGetWindSpeed() {
        // Create sample weather data
        WeatherData weatherData = new WeatherData("2024-03-16", "Temperature: 25, Humidity: 60");

        // Verify the wind speed is as expected
        assertEquals(9.0, weatherData.getWindSpeed(), 1);
    }

    @Test
    public void testGetHumidity() {
        // Create sample weather data
        WeatherData weatherData = new WeatherData("2024-03-16", "Temperature: 25, Humidity: 60");

        // Verify the humidity is as expected
        assertEquals(60.0, weatherData.getHumidity(), 1);
    }

    @Test
    public void testGetPressure() {
        // Create sample weather data
        WeatherData weatherData = new WeatherData("2024-03-16", "Temperature: 25, Humidity: 60");

        // Verify the pressure is as expected
        assertEquals(950.0, weatherData.getPressure(), 1);
    }

    @Test
    public void testGetWindDirection() {
        // Create sample weather data
        WeatherData weatherData = new WeatherData("2024-03-16", "Temperature: 25, Humidity: 60");

        // Verify the wind direction is as expected
        assertEquals("Northeast", weatherData.getWindDirection());
    }

    @Test
    public void testGetElevation() {
        // Create sample weather data
        WeatherData weatherData = new WeatherData("2024-03-16", "Temperature: 25, Humidity: 60");

        // Verify the elevation is as expected
        assertEquals(0.5f, weatherData.getElevation(), 1);
    }

}