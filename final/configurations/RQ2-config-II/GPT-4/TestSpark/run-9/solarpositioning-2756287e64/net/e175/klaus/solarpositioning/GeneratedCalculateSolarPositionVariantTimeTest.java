package net.e175.klaus.solarpositioning;

import java.time.ZonedDateTime;
import java.time.ZoneOffset;

import org.junit.Test;

import static org.junit.Assert.*;

import net.e175.klaus.solarpositioning.Grena3;
import net.e175.klaus.solarpositioning.AzimuthZenithAngle;

public class GeneratedCalculateSolarPositionVariantTimeTest {

    @Test
    public void calculateSolarPositionVariantTimeTest() {
        ZonedDateTime date = ZonedDateTime.of(2020, 7, 20, 18, 0, 0, 0, ZoneOffset.UTC);
        double latitude = 40.71;
        double longitude = -74.01;
        double deltaT = 69.0;

        AzimuthZenithAngle position = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);

        assertNotNull(position);
        assertEquals(240.294, position.getAzimuth(), 0.01);
        assertEquals(400.914, position.getZenithAngle(), 0.001);
    }

}