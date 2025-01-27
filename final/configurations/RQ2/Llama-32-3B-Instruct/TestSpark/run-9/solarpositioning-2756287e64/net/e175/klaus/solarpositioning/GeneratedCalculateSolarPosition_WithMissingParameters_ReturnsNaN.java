package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSolarPosition_WithMissingParameters_ReturnsNaN {

    @Test
    public void calculateSolarPosition_WithMissingParameters_ReturnsNaN() {
        ZonedDateTime date = null;
        double latitude = 37.7749;
        double longitude = -122.4194;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude);

        assertEquals(Double.NaN, result.getAzimuth(), 0.01);
    }

}