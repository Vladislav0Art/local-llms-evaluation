package net.e175.klaus.solarpositioning;

import org.junit.Test;
import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import net.e175.klaus.solarpositioning.Grena3;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import static org.junit.Assert.*;

public class GeneratedTest {

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

    @Test
    public void calculateSolarPositionForNowWithRefractionTest() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 40.7128; // New York, USA
        double longitude = -74.0060; // New York, USA
        double deltaT = 69.182; // Delta T for 2021
        double pressure = 1013.5; // Global average sea level pressure
        double temperature = 15.0; // Global average temperature
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);
        assertNotNull(result);
    }

    @Test
    public void calculateSolarPositionUseInvalidPressureAndTemperatureTest() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 90.0; // North Pole
        double longitude = 0.0; // Prime Meridian
        double deltaT = 69.182; // Delta T for 2021
        double pressure = 5000.0; // Invalid pressure
        double temperature = 500.0; // Invalid temperature
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);
        assertNotNull(result);
    }

}