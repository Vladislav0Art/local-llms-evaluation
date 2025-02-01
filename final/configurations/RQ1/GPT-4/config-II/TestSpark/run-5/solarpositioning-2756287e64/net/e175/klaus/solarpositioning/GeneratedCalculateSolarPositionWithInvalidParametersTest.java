package net.e175.klaus.solarpositioning;

import static org.junit.Assert.*;

import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import org.junit.Test;

import java.time.ZonedDateTime;
import java.time.ZoneOffset;

public class GeneratedCalculateSolarPositionWithInvalidParametersTest {

    @Test
    public void calculateSolarPositionWithInvalidParametersTest() {
        ZonedDateTime date = ZonedDateTime.of(1910, 1, 1, 10, 0, 0, 0, ZoneOffset.UTC);
        double latitude = -90;
        double longitude = 178;
        double deltaT = 0;
        double pressure = 100000; // out of bounds
        double temperature = -500; // out of bounds

        AzimuthZenithAngle position = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);

        assertNotNull(position);
        assertTrue(position.getAzimuth() >= 0 && position.getAzimuth() < 360);
        assertTrue(position.getZenithAngle() >= 0 && position.getZenithAngle() < 180);
    }

}