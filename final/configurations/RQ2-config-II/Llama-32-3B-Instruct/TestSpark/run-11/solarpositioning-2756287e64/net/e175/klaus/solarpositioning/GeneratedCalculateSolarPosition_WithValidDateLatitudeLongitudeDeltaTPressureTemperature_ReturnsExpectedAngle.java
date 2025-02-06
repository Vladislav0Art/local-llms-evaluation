package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSolarPosition_WithValidDateLatitudeLongitudeDeltaTPressureTemperature_ReturnsExpectedAngle {

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

}