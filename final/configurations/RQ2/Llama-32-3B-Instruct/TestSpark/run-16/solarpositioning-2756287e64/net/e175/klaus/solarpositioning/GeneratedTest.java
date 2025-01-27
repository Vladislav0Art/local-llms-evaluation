package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.lang.Math;

public class GeneratedTest {

    @Test
    public void calculateSolarPositionValidDateTest() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 0.0;
        double longitude = 0.0;
        double deltaT = 0.0;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
        assertNotNull(result);
    }

    @Test
    public void calculateSolarPositionInvalidDateTest() {
        ZonedDateTime date = null;
        double latitude = 0.0;
        double longitude = 0.0;
        double deltaT = 0.0;
        try {
            Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
            assert false;
        } catch (NullPointerException e) {
            assertTrue(true);
        }
    }

    @Test
    public void calculateSolarPositionNullDateParameterTest() {
        ZonedDateTime date = null;
        double latitude = 0.0;
        double longitude = 0.0;
        double deltaT = 0.0;
        try {
            Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
            assert false;
        } catch (NullPointerException e) {
            assertTrue(true);
        }
    }

    @Test
    public void calculateSolarPositionNaNLatitudeTest() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = Double.NaN;
        double longitude = 0.0;
        double deltaT = 0.0;
        try {
            Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
            assert false;
        } catch (ArithmeticException e) {
            assertTrue(true);
        }
    }

    @Test
    public void calculateSolarPositionNaNLongitudeTest() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 0.0;
        double longitude = Double.NaN;
        double deltaT = 0.0;
        try {
            Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
            assert false;
        } catch (ArithmeticException e) {
            assertTrue(true);
        }
    }

    @Test
    public void calculateSolarPositionNaNDeltaTTest() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 0.0;
        double longitude = 0.0;
        double deltaT = Double.NaN;
        try {
            Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
            assert false;
        } catch (ArithmeticException e) {
            assertTrue(true);
        }
    }

    @Test
    public void calculateSolarPositionMultipleArgumentsTest() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 0.0;
        double longitude = 0.0;
        double deltaT = 0.0;
        double pressure = 1013.25; // Valid value
        double temperature = 22.5; // Valid value
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);
        assertNotNull(result);
    }

    @Test
    public void calculateSolarPositionPressureAndTemperatureMissingArgumentsTest() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 0.0;
        double longitude = 0.0;
        double deltaT = 0.0;
        try {
            Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, null, null);
            assert false;
        } catch (NullPointerException e) {
            assertTrue(true);
        }
    }

}