package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZonedDateTime;
import java.time.ZoneOffset;
import java.lang.Math;

import static java.lang.Math.*;

public class GeneratedCalculateSolarPosition_WithNaNLongitude_ReturnsNaN {

    @Test
    public void calculateSolarPosition_WithNaNLongitude_ReturnsNaN() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 40.7128; // New York
        double longitude = Double.NaN;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, 0.0, 101325, 15.0);
        Double expected = Double.NaN;
        assertEquals(expected, result.getAzimuth(), 1e-9);
    }

}