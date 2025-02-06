package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZonedDateTime;
import java.time.ZoneOffset;
import java.lang.Math;

import net.e175.klaus.solarpositioning.AzimuthZenithAngle;

public class GeneratedCalculateSolarPosition_InvalidDeltaTTest {

    @Test
    public void calculateSolarPosition_InvalidDeltaTTest() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 0.0;
        double longitude = 0.0;
        double deltaT = Double.POSITIVE_INFINITY;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
        assertNull(result);
    }

}