package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSolarPosition_ZeroLongitude_ReturnsCorrectResult {

    @Test
    public void calculateSolarPosition_ZeroLongitude_ReturnsCorrectResult() {
        double latitude = 37.7749;
        double longitude = 0.0;
        ZonedDateTime date = ZonedDateTime.now();
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude);
        assertEquals(90.0, result.getAzimuth(), 0.01);
        assertEquals(-90.0, result.getZenith(), 0.01);
    }

}