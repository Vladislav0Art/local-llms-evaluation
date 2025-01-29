package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestGetWindSpeed {

    @Test
    public void testGetWindSpeed() {
        // Create sample weather data
        WeatherData weatherData = new WeatherData("2024-03-16", "Temperature: 25, Humidity: 60");

        // Verify the wind speed is as expected
        assertEquals(9.0, weatherData.getWindSpeed(), 1);
    }

}