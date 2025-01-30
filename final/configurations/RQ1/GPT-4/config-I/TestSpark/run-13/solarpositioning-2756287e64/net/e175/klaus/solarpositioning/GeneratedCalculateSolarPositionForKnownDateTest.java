package net.e175.klaus.solarpositioning;

import org.junit.Test;
import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import net.e175.klaus.solarpositioning.Grena3;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import static org.junit.Assert.*;

public class GeneratedCalculateSolarPositionForKnownDateTest {

    @Test
    public void calculateSolarPositionForKnownDateTest() {
        ZonedDateTime date = ZonedDateTime.of(2020, 5, 1, 0, 0, 0, 0, ZoneOffset.UTC);
        double latitude = 52.5196; // Berlin, Germany
        double longitude = 13.4069; // Berlin, Germany
        double deltaT = 68.8033; // Delta T for May 2020
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
        assertNotNull(result);
        assertEquals(307.929, result.getZenithAngle(), 0.01);
        assertEquals(347.350, result.getAzimuth(), 0.01);
    }

}