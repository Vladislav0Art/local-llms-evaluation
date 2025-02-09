package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import static java.lang.Math.toRadians;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import net.e175.klaus.solarpositioning.Grena3;

public class GeneratedTest {

    public static final double DELTA = 1e-5;
    public static final double DELTA_T = 74;

    @Test
    public void calculateSolarPositionMethod1Test() {
        ZonedDateTime date = ZonedDateTime.of(2032, 6, 30, 12, 0, 0, 0, ZoneOffset.UTC);
        double latitude = toRadians(48.21);
        double longitude = toRadians(16.37);
        AzimuthZenithAngle azimuthZenithAngle = Grena3.calculateSolarPosition(date, latitude, longitude, DELTA_T);

        assertNotNull(azimuthZenithAngle);
        assertEquals(toRadians(123.42), azimuthZenithAngle.getAzimuth(), DELTA);
        assertEquals(toRadians(40.47), azimuthZenithAngle.getZenithAngle(), DELTA);
    }

    @Test
    public void calculateSolarPositionMethod2Test() {
        ZonedDateTime date = ZonedDateTime.of(2032, 6, 30, 12, 0, 0, 0, ZoneOffset.UTC);
        double latitude = toRadians(48.21);
        double longitude = toRadians(16.37);
        double pressure = 1010;
        double temperature = 25;

        AzimuthZenithAngle azimuthZenithAngle =
                Grena3.calculateSolarPosition(date, latitude, longitude, DELTA_T, pressure, temperature);

        assertNotNull(azimuthZenithAngle);
        assertEquals(toRadians(123.42), azimuthZenithAngle.getAzimuth(), DELTA);
        assertEquals(toRadians(40.42), azimuthZenithAngle.getZenithAngle(), DELTA);
    }

}