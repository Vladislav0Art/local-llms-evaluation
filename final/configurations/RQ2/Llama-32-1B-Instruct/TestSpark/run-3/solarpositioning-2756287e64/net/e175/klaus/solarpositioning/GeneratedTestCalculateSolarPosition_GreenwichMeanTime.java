package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestCalculateSolarPosition_GreenwichMeanTime {

    @Test
    public void testCalculateSolarPosition_GreenwichMeanTime() {
        // Arrange
        double latitude = 40.7128; // New York City latitude
        ZonedDateTime date = ZonedDateTime.of(2022, 7, 4, -5, 0, 0); // Greenwich Mean Time (UTC)
        double deltaT = 1.0;
        double pressure = 1015.0;
        double temperature = 288.15;

        // Act
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, -74.0060, deltaT, pressure, temperature);

        // Assert
        assertEquals(22.0, Math.toRadians(result.getBaz Zenith Angle), 1);
    }

}