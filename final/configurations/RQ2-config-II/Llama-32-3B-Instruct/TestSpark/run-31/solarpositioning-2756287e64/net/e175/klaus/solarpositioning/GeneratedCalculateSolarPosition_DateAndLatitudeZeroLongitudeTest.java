package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.lang.Math;

public class GeneratedCalculateSolarPosition_DateAndLatitudeZeroLongitudeTest {

    @Test
    public void calculateSolarPosition_DateAndLatitudeZeroLongitudeTest() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 45.0;
        double longitude = 0.0;
        AzimuthZenithAngle angle = Grena3.calculateSolarPosition(date, latitude, longitude, 1.0);
        assertNotNull(angle);
    }

}