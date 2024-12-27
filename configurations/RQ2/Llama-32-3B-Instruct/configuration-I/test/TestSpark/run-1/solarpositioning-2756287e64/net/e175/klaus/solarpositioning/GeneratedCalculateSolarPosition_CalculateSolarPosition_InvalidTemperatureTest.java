package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZonedDateTime;
import java.util.Random;

public class GeneratedCalculateSolarPosition_CalculateSolarPosition_InvalidTemperatureTest {

    @Test
    public void calculateSolarPosition_CalculateSolarPosition_InvalidTemperatureTest() {
        // Arrange
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 37.7749;
        double longitude = -122.4194;
        double deltaT = 12.0;
        double temperature = -20.0;

        // Act and Assert
        try {
            Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, temperature);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Temperature must be greater than or equal to 0", e.getMessage());
        }
    }

}