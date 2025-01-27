package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.concurrent.TimeUnit;

import org.mockito.Mockito;

public class GeneratedCalculateSolarPosition_WithInvalidLongitude_ReturnsNaN {

    @Test
    public void calculateSolarPosition_WithInvalidLongitude_ReturnsNaN() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 37.7749;
        double longitude = 180;
        double deltaT = 10;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
        Double expected = Double.NaN;
        assertEquals(expected, result.getAzimuth(), 1e-6);
    }

}