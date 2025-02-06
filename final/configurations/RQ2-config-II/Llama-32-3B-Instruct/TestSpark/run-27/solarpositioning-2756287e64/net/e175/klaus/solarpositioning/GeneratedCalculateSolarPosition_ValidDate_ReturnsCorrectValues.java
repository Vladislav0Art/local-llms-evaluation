package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSolarPosition_ValidDate_ReturnsCorrectValues {

    @Test
    public void calculateSolarPosition_ValidDate_ReturnsCorrectValues() {
        ZonedDateTime date = ZonedDateTime.of(2022, 6, 21, 10, 0, 0, ZoneOffset.UTC);
        double latitude = 45.0;
        double longitude = 4.0;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, 0.0);
        assertEquals(100.0, result.getAzimuth(), 0.001);
        assertEquals(20.0, result.getZenith(), 0.001);
    }

}