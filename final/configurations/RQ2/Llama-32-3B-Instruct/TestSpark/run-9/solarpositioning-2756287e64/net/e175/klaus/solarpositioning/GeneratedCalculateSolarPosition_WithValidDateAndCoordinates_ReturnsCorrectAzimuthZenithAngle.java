package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSolarPosition_WithValidDateAndCoordinates_ReturnsCorrectAzimuthZenithAngle {

    @Test
    public void calculateSolarPosition_WithValidDateAndCoordinates_ReturnsCorrectAzimuthZenithAngle() {
        ZonedDateTime date = ZonedDateTime.of(2022, 1, 1, 0, 0, 0, ZoneOffset.UTC);
        double latitude = 37.7749;
        double longitude = -122.4194;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude);

        assertEquals(90.0, result.getAzimuth(), 0.01);
        assertEquals(-10.23, result.getZenith(), 0.01);
    }

}