package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSolarPosition_WithInvalidPressureTemperature_ThrowsException {

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