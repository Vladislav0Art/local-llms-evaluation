package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSolarPosition_WithMissingLatitude_ReturnsNaN {

    @Test
    public void calculateSolarPosition_WithMissingLatitude_ReturnsNaN() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = Double.NaN;
        double longitude = -122.4194;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude);
        assertEquals(NAN, result.getAzimuth(), EPSILON); // Note: This is a placeholder for actual assertion
    }

}