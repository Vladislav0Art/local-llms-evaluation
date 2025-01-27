package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZonedDateTime;

import static java.lang.Math.*;

public class GeneratedCalculateSolarPositionNullLatitudeTest {

    @Test
    public void calculateSolarPositionNullLatitudeTest() {
        ZonedDateTime date = ZonedDateTime.of(2022, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC);
        double latitude = null;
        double longitude = -74.0060;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, 0);
        assertNull(result);
    }

}