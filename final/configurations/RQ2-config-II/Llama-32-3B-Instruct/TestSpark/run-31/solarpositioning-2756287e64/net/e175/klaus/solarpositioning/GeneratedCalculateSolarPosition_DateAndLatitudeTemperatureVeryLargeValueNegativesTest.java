package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.lang.Math;

public class GeneratedCalculateSolarPosition_DateAndLatitudeTemperatureVeryLargeValueNegativesTest {

    @Test
    public void calculateSolarPosition_DateAndLatitudeTemperatureVeryLargeValueNegativesTest() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 45.0;
        double longitude = 12.0;
        AzimuthZenithAngle angle = Grena3.calculateSolarPosition(date, latitude, longitude, 1.0, 101325, Integer.MIN_VALUE);
        assertNotNull(angle);
    }

}