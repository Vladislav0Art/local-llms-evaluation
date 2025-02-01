package net.e175.klaus.solarpositioning;

import static org.junit.Assert.*;

import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import org.junit.Test;

import java.time.ZonedDateTime;
import java.time.ZoneOffset;

public class GeneratedCalculateSolarPositionWithAllParametersTest {

    @Test
    public void calculateSolarPositionWithAllParametersTest() {
        ZonedDateTime date = ZonedDateTime.of(2142, 1, 1, 10, 0, 0, 0, ZoneOffset.UTC);
        double latitude = 0;
        double longitude = 0;
        double deltaT = 0;
        double pressure = 1000;
        double temperature = 20;

        AzimuthZenithAngle position = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);

        assertNotNull(position);
        assertTrue(position.getAzimuth() >= 0 && position.getAzimuth() < 360);
        assertTrue(position.getZenithAngle() >= 0 && position.getZenithAngle() < 180);
    }

}