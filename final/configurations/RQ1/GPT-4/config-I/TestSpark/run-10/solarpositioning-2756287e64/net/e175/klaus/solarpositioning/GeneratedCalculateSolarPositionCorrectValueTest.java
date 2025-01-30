package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import static org.junit.Assert.*;

public class GeneratedCalculateSolarPositionCorrectValueTest {

    private static final double DELTA = 1e-6;

    @Test
    public void calculateSolarPositionCorrectValueTest() {
        double latitude = 32.71;
        double longitude = 10.71;
        double deltaT = 67.0;

        ZonedDateTime dateTime = ZonedDateTime.of(2020, 7, 20, 12, 0, 0, 0, ZoneId.of("UTC"));

        AzimuthZenithAngle position = Grena3.calculateSolarPosition(dateTime, latitude, longitude, deltaT);

        assertEquals(171.488665, position.getAzimuth(), DELTA);
        assertEquals(31.222005, position.getZenithAngle(), DELTA);
    }

}