package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import static org.junit.Assert.*;

public class GeneratedCalculateSolarPositionWithTemperaturePressureCorrectValueTest {

    private static final double DELTA = 1e-6;

    @Test
    public void calculateSolarPositionWithTemperaturePressureCorrectValueTest() {
        double latitude = 32.71;
        double longitude = 10.71;
        double deltaT = 67.0;
        double pressure = 1000;
        double temperature = 15;

        ZonedDateTime dateTime = ZonedDateTime.of(2020, 7, 20, 12, 0, 0, 0, ZoneId.of("UTC"));

        AzimuthZenithAngle position = Grena3.calculateSolarPosition(dateTime, latitude, longitude, deltaT, pressure, temperature);

        assertEquals(171.486373, position.getAzimuth(), DELTA);
        assertEquals(30.920695, position.getZenithAngle(), DELTA);
    }

}