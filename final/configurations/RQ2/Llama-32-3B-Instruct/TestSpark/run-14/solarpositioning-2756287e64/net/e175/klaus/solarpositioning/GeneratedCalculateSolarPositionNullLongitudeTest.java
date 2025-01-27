package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZonedDateTime;

import static java.lang.Math.*;

public class GeneratedCalculateSolarPositionNullLongitudeTest {

    @Test
    public void calculateSolarPositionNullLongitudeTest() {
        ZonedDateTime date = ZonedDateTime.of(2022, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC);
        double latitude = 40.7128;
        double longitude = null;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, 0);
        assertNull(result);
    }

}