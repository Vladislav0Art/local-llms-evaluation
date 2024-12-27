package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZonedDateTime;
import java.util.Random;

public class GeneratedTest {

    @Test
    public void calculateSolarPosition_CalculateSolarPosition_LoneCaseTest() {
        // Arrange
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 37.7749;
        double longitude = -122.4194;
        double deltaT = 12.0;

        // Act
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);

        // Assert
        assertNotNull(result);
    }

    @Test
    public void calculateSolarPosition_CalculateSolarPosition_MultipleParametersTest() {
        // Arrange
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 37.7749;
        double longitude = -122.4194;
        double deltaT = 12.0;
        double pressure = 1013.25;
        double temperature = 20.0;

        // Act
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);

        // Assert
        assertNotNull(result);
    }

    @Test
    public void calculateSolarPosition_CalculateSolarPosition_MultipleParameters_DoesNotUseTest() {
        // Arrange
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 37.7749;
        double longitude = -122.4194;

        // Act and Assert
        try {
            Grena3.calculateSolarPosition(date, latitude, longitude, 0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Delta time must be greater than or equal to 0", e.getMessage());
        }
    }

    @Test
    public void calculateSolarPosition_CalculateSolarPosition_NegativeLatitudeTest() {
        // Arrange
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = -37.7749;
        double longitude = -122.4194;
        double deltaT = 12.0;

        // Act
        Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
    }

    @Test
    public void calculateSolarPosition_CalculateSolarPosition_NegativeLongitudeTest() {
        // Arrange
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 37.7749;
        double longitude = -122.4194;
        double deltaT = 12.0;

        // Act
        Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
    }

    @Test
    public void calculateSolarPosition_CalculateSolarPosition_NegativeDeltaTimeTest() {
        // Arrange
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 37.7749;
        double longitude = -122.4194;
        double deltaT = Double.NEGATIVE_INFINITY;

        // Act
        Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
    }

    @Test
    public void calculateSolarPosition_CalculateSolarPosition_InvalidDateTest() {
        // Arrange
        ZonedDateTime date = null;
        double latitude = 37.7749;
        double longitude = -122.4194;
        double deltaT = 12.0;

        // Act
        Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
    }

    @Test
    public void calculateSolarPosition_CalculateSolarPosition_DivByZeroTest() {
        // Arrange
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 37.7749;
        double longitude = -122.4194;

        // Act and Assert
        try {
            Grena3.calculateSolarPosition(date, latitude, longitude, 0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Cannot divide by zero", e.getMessage());
        }
    }

}