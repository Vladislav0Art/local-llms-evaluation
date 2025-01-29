package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestGetWindDirection {

    @Test
    public void testGetWindDirection() {
        // Create sample weather data
        WeatherData weatherData = new WeatherData("2024-03-16", "Temperature: 25, Humidity: 60");

        // Verify the wind direction is as expected
        assertEquals("Northeast", weatherData.getWindDirection());
    }

}