package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestCalculateSolarPosition_Angle {

    @Test
    public void testCalculateSolarPosition_Angle() {
        // Arrange
        double latitude = 40.7128; // New York City latitude
        double longitude = -74.0060; // New York City longitude
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double deltaT = 1.0;
        double pressure = 1015.0;
        double temperature = 288.15;

        // Act
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);

        // Assert
        assertEquals(75.0, Math.toRadians(result.getA azimuth Zenith Angle), 1);
    }

}