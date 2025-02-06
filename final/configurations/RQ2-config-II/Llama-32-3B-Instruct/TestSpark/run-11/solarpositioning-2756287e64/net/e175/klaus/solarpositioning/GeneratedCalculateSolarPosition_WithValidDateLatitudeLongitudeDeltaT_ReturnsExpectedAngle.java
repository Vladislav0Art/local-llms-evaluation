package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSolarPosition_WithValidDateLatitudeLongitudeDeltaT_ReturnsExpectedAngle {

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

}