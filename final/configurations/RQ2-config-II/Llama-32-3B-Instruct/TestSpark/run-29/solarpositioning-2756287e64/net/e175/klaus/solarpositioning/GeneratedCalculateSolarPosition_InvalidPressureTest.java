package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZonedDateTime;
import java.time.ZoneOffset;
import java.lang.Math;

import net.e175.klaus.solarpositioning.AzimuthZenithAngle;

public class GeneratedCalculateSolarPosition_InvalidPressureTest {

    @Test
    public void calculateSolarPosition_InvalidPressureTest() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 0.0;
        double longitude = 0.0;
        double deltaT = 0.0;
        double pressure = Double.POSITIVE_INFINITY;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure);
        assertNull(result);
    }

}