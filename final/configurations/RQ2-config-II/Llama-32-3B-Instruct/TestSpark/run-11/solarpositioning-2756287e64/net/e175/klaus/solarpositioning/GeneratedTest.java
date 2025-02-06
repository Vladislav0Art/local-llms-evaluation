package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void calculateSolarPosition_WithValidDateLatitudeLongitudeDeltaT_ReturnsExpectedAngle() {
        // Arrange
        ZonedDateTime date = ZonedDateTime.of(2022, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC);
        double latitude = 45.678;
        double longitude = -74.123;
        double deltaT = 10;

        // Act
        AzimuthZenithAngle angle = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);

        // Assert
        assertEquals(1.0, angle.getAzimuth(), 0.01);
    }

    @Test
    public void calculateSolarPosition_WithInvalidDateLatitudeLongitudeDeltaT_ThrowsException() {
        // Arrange
        ZonedDateTime date = null;
        double latitude = 45.678;
        double longitude = -74.123;
        double deltaT = 10;

        // Act and Assert
        assertThrows(NullPointerException.class, () -> Grena3.calculateSolarPosition(date, latitude, longitude, deltaT));
    }

    @Test
    public void calculateSolarPosition_WithValidDateLatitudeLongitudeDeltaTPressureTemperature_ReturnsExpectedAngle() {
        // Arrange
        ZonedDateTime date = ZonedDateTime.of(2022, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC);
        double latitude = 45.678;
        double longitude = -74.123;
        double deltaT = 10;
        double pressure = 1013.25;
        double temperature = 20;

        // Act
        AzimuthZenithAngle angle = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);

        // Assert
        assertEquals(2.0, angle.getAzimuth(), 0.01);
    }

    @Test
    public void calculateSolarPosition_WithInvalidPressureTemperature_ThrowsException() {
        // Arrange
        ZonedDateTime date = ZonedDateTime.of(2022, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC);
        double latitude = 45.678;
        double longitude = -74.123;
        double deltaT = 10;
        double pressure = Double.NaN;
        double temperature = 20;

        // Act and Assert
        assertThrows(IllegalArgumentException.class, () -> Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature));
    }

}