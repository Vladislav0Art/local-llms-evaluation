package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSolarPosition_WithMissingLongitude_ReturnsNaN {

    @Test
    public void calculateSolarPosition_WithMissingLongitude_ReturnsNaN() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 37.7749;
        double longitude = Double.NaN;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude);
        assertEquals(NAN, result.getAzimuth(), EPSILON); // Note: This is a placeholder for actual assertion
    }

}