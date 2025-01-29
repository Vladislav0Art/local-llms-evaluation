package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestGetHumidity {

    @Test
    public void testGetHumidity() {
        // Create sample weather data
        WeatherData weatherData = new WeatherData("2024-03-16", "Temperature: 25, Humidity: 60");

        // Verify the humidity is as expected
        assertEquals(60.0, weatherData.getHumidity(), 1);
    }

}