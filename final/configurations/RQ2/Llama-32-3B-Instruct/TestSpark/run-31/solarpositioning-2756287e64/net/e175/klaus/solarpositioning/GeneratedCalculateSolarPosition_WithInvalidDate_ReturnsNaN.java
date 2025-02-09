package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZonedDateTime;
import java.time.ZoneOffset;
import java.lang.Math;

import static java.lang.Math.*;

public class GeneratedCalculateSolarPosition_WithInvalidDate_ReturnsNaN {

    @Test
    public void calculateSolarPosition_WithInvalidDate_ReturnsNaN() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC).minusDays(1);
        double latitude = 40.7128; // New York
        double longitude = -74.0060;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, 0.0);
        Double expected = Double.NaN;
        assertEquals(expected, result.getAzimuth(), 1e-9);
    }

}