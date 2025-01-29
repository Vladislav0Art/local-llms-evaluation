package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestGetWeatherDescription {

    @Test
    public void testGetWeatherDescription() {
        // Create sample weather data
        WeatherData weatherData = new WeatherData("2024-03-16", "Temperature: 25, Humidity: 60");

        // Verify the weather description is as expected
        assertEquals("Partly Cloudy", weatherData.getWeatherDescription());
    }

}