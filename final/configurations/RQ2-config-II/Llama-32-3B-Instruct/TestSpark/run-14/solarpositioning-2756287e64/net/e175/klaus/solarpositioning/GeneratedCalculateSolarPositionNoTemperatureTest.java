package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import org.mockito.Mockito;

public class GeneratedCalculateSolarPositionNoTemperatureTest {

    @Test
    public void calculateSolarPositionNoTemperatureTest() {
        assertEquals(AzimuthZenithAngle.NONE, Grena3.calculateSolarPosition(ZonedDateTime.of(2020, 1, 1, 12, 0, 0, 0, ZoneOffset.UTC), 40.8, -74.5, 4, 101325, Double.NEGATIVE_INFINITY));
    }

}