package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.concurrent.TimeUnit;

import org.mockito.Mockito;

public class GeneratedCalculateSolarPosition_WithNegativeTemperature_ReturnsNaN {

    @Test
    public void calculateSolarPosition_WithNegativeTemperature_ReturnsNaN() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 37.7749;
        double longitude = -122.4194;
        double deltaT = 10;
        double pressure = 1013.25;
        double temperature = Double.NEGATIVE_INFINITY;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);
        Double expected = Double.NaN;
        assertEquals(expected, result.getAzimuth(), 1e-6);
    }

}