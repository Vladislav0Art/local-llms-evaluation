package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSolarPosition_WithMissingDeltaT_ReturnsNaN {

    @Test
    public void calculateSolarPosition_WithMissingDeltaT_ReturnsNaN() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 37.7749;
        double longitude = -122.4194;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, Double.NaN);
        assertEquals(NAN, result.getAzimuth(), EPSILON); // Note: This is a placeholder for actual assertion
    }

}