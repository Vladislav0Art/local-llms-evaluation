package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSolarPosition_WithMultipleParameters_ReturnsCorrectAzimuthZenithAngle {

    @Test
    public void calculateSolarPosition_WithMultipleParameters_ReturnsCorrectAzimuthZenithAngle() {
        ZonedDateTime date = ZonedDateTime.of(2022, 1, 1, 0, 0, 0, ZoneOffset.UTC);
        double latitude = 37.7749;
        double longitude = -122.4194;
        double deltaT = 10;
        double pressure = 1013;
        double temperature = 293;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);

        assertEquals(90.0, result.getAzimuth(), 0.01);
        assertEquals(-10.23, result.getZenith(), 0.01);
    }

}