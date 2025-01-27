package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSolarPosition_WithInvalidLatitude_ReturnsNaN {

    @Test
    public void calculateSolarPosition_WithInvalidLatitude_ReturnsNaN() {
        ZonedDateTime date = ZonedDateTime.of(2022, 1, 1, 0, 0, 0, ZoneOffset.UTC);
        double latitude = -90;
        double longitude = -122.4194;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude);

        assertEquals(Double.NaN, result.getAzimuth(), 0.01);
    }

}