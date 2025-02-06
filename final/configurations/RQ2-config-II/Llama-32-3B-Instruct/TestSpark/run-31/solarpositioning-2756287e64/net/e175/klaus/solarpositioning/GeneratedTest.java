package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.lang.Math;

public class GeneratedTest {

    @Test
    public void calculateSolarPosition_DateAndLatitudeTest() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 45.0;
        double longitude = 12.0;
        AzimuthZenithAngle angle = Grena3.calculateSolarPosition(date, latitude, longitude, 1.0);
        assertNotNull(angle);
    }

    @Test
    public void calculateSolarPosition_DateAndLatitudeZeroLongitudeTest() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 45.0;
        double longitude = 0.0;
        AzimuthZenithAngle angle = Grena3.calculateSolarPosition(date, latitude, longitude, 1.0);
        assertNotNull(angle);
    }

    @Test
    public void calculateSolarPosition_DateAndLatitudeNegativeLongitudeTest() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 45.0;
        double longitude = -12.0;
        AzimuthZenithAngle angle = Grena3.calculateSolarPosition(date, latitude, longitude, 1.0);
        assertNotNull(angle);
    }

    @Test
    public void calculateSolarPosition_DateAndLatitudeDeltaTZeroTest() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 45.0;
        double longitude = 12.0;
        AzimuthZenithAngle angle = Grena3.calculateSolarPosition(date, latitude, longitude, 1.0);
        assertNotNull(angle);
    }

    @Test
    public void calculateSolarPosition_DateAndLatitudeDeltaTNegativeTest() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 45.0;
        double longitude = 12.0;
        AzimuthZenithAngle angle = Grena3.calculateSolarPosition(date, latitude, longitude, -1.0);
        assertNotNull(angle);
    }

    @Test
    public void calculateSolarPosition_DateAndLatitudePressureZeroTest() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 45.0;
        double longitude = 12.0;
        AzimuthZenithAngle angle = Grena3.calculateSolarPosition(date, latitude, longitude, 1.0, 101325, 20.0);
        assertNotNull(angle);
    }

    @Test
    public void calculateSolarPosition_DateAndLatitudePressureNegativeTest() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 45.0;
        double longitude = 12.0;
        AzimuthZenithAngle angle = Grena3.calculateSolarPosition(date, latitude, longitude, 1.0, -101325, 20.0);
        assertNotNull(angle);
    }

    @Test
    public void calculateSolarPosition_DateAndLatitudeTemperatureZeroTest() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 45.0;
        double longitude = 12.0;
        AzimuthZenithAngle angle = Grena3.calculateSolarPosition(date, latitude, longitude, 1.0, 101325, -20.0);
        assertNotNull(angle);
    }

    @Test
    public void calculateSolarPosition_DateAndLatitudeTemperatureNegativeTest() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 45.0;
        double longitude = 12.0;
        AzimuthZenithAngle angle = Grena3.calculateSolarPosition(date, latitude, longitude, 1.0, 101325, -30.0);
        assertNotNull(angle);
    }

    @Test
    public void calculateSolarPosition_DateAndLatitudeTemperaturePositiveTest() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 45.0;
        double longitude = 12.0;
        AzimuthZenithAngle angle = Grena3.calculateSolarPosition(date, latitude, longitude, 1.0, 101325, 30.0);
        assertNotNull(angle);
    }

    @Test
    public void calculateSolarPosition_DateAndLatitudeTemperatureLargeValueTest() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 45.0;
        double longitude = 12.0;
        AzimuthZenithAngle angle = Grena3.calculateSolarPosition(date, latitude, longitude, 1.0, 101325, 10000.0);
        assertNotNull(angle);
    }

    @Test
    public void calculateSolarPosition_DateAndLatitudeTemperatureVeryLargeValueTest() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 45.0;
        double longitude = 12.0;
        AzimuthZenithAngle angle = Grena3.calculateSolarPosition(date, latitude, longitude, 1.0, 101325, Integer.MAX_VALUE);
        assertNotNull(angle);
    }

    @Test
    public void calculateSolarPosition_DateAndLatitudeTemperatureVeryLargeValueNegativesTest() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 45.0;
        double longitude = 12.0;
        AzimuthZenithAngle angle = Grena3.calculateSolarPosition(date, latitude, longitude, 1.0, 101325, Integer.MIN_VALUE);
        assertNotNull(angle);
    }

}