package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZonedDateTime;
import java.util.Random;

public class GeneratedCalculateSolarPosition_CalculateSolarPosition_InvalidDeltaTimeTest {

    @Test
    public void calculateSolarPosition_CalculateSolarPosition_InvalidDeltaTimeTest() {
        // Arrange
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 37.7749;
        double longitude = -122.4194;
        double deltaT = Double.POSITIVE_INFINITY;

        // Act and Assert
        try {
            Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Delta time must be between 0 and positive infinity", e.getMessage());
        }
    }

}