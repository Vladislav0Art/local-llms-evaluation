package net.e175.klaus.solarpositioning;

import java.time.ZonedDateTime;
import java.time.ZoneOffset;

import org.junit.Test;

import static org.junit.Assert.*;

import net.e175.klaus.solarpositioning.Grena3;
import net.e175.klaus.solarpositioning.AzimuthZenithAngle;

public class GeneratedCalculateSolarPositionVariantLocationTest {

    @Test
    public void calculateSolarPositionVariantLocationTest() {
        ZonedDateTime date = ZonedDateTime.of(2020, 7, 20, 12, 0, 0, 0, ZoneOffset.UTC);
        double latitude = 36.14;
        double longitude = -115.15;
        double deltaT = 69.0;

        AzimuthZenithAngle position = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);

        assertNotNull(position);
        assertEquals(210.728, position.getAzimuth(), 0.01);
        assertEquals(360.367, position.getZenithAngle(), 0.001);
    }

}