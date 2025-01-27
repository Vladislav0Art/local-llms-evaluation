package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZonedDateTime;

import static java.lang.Math.*;

public class GeneratedCalculateSolarPositionInvalidDateTest {

    @Test
    public void calculateSolarPositionInvalidDateTest() {
        ZonedDateTime date = null;
        double latitude = 40.7128;
        double longitude = -74.0060;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, 0);
        assertNull(result);
    }

}