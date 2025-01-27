package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZonedDateTime;

import static java.lang.Math.*;

public class GeneratedTest {

    @Test
    public void calculateSolarPositionValidDateTest() {
        ZonedDateTime date = ZonedDateTime.of(2022, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC);
        double latitude = 40.7128;
        double longitude = -74.0060;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, 0);
        assertNotNull(result);
    }

    @Test
    public void calculateSolarPositionInvalidDateTest() {
        ZonedDateTime date = null;
        double latitude = 40.7128;
        double longitude = -74.0060;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, 0);
        assertNull(result);
    }

    @Test
    public void calculateSolarPositionNullLatitudeTest() {
        ZonedDateTime date = ZonedDateTime.of(2022, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC);
        double latitude = null;
        double longitude = -74.0060;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, 0);
        assertNull(result);
    }

    @Test
    public void calculateSolarPositionNullLongitudeTest() {
        ZonedDateTime date = ZonedDateTime.of(2022, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC);
        double latitude = 40.7128;
        double longitude = null;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, 0);
        assertNull(result);
    }

    @Test
    public void calculateSolarPositionDeltaTZeroTest() {
        ZonedDateTime date = ZonedDateTime.of(2022, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC);
        double latitude = 40.7128;
        double longitude = -74.0060;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, 0);
        assertEquals(0, result.getAzimuth(), 1e-9);
    }

    @Test
    public void calculateSolarPositionDeltaTNonZeroTest() {
        ZonedDateTime date = ZonedDateTime.of(2022, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC);
        double latitude = 40.7128;
        double longitude = -74.0060;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, 10);
        assertTrue(result.getAzimuth() > 0 && result.getAzimuth() < 360);
    }

    @Test
    public void calculateSolarPositionAllParamsNullTest() {
        ZonedDateTime date = null;
        double latitude = null;
        double longitude = null;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, 0, 101325, -20);
        assertNull(result);
    }

    @Test
    public void calculateSolarPositionAllParamsNotNaNTest() {
        ZonedDateTime date = ZonedDateTime.of(2022, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC);
        double latitude = 40.7128;
        double longitude = -74.0060;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, 10);
        assertNotNull(result);
    }

    @Test
    public void calculateSolarPositionAllParamsDifferentZeroesTest() {
        ZonedDateTime date = ZonedDateTime.of(2022, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC);
        double latitude = 40.7128;
        double longitude = -74.0060;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, 10, 101325, -20);
        assertNotNull(result);
    }

}