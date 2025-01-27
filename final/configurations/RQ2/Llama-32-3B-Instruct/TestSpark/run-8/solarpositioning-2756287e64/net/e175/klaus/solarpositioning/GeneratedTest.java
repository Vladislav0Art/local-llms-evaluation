package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.concurrent.TimeUnit;

import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void calculateSolarPosition_WithDefaultParameters_ReturnsExpectedResult() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 37.7749;
        double longitude = -122.4194;
        double deltaT = 10;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
        assertNotNull(result);
    }

    @Test
    public void calculateSolarPosition_WithPressureAndTemperature_ReturnsExpectedResult() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 37.7749;
        double longitude = -122.4194;
        double deltaT = 10;
        double pressure = 1013.25;
        double temperature = 20;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);
        assertNotNull(result);
    }

    @Test
    public void calculateSolarPosition_WithInvalidDate_ReturnsNaN() {
        ZonedDateTime date = null;
        double latitude = 37.7749;
        double longitude = -122.4194;
        double deltaT = 10;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
        Double expected = Double.NaN;
        assertEquals(expected, result.getAzimuth(), 1e-6);
    }

    @Test
    public void calculateSolarPosition_WithInvalidLatitude_ReturnsNaN() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = -90;
        double longitude = -122.4194;
        double deltaT = 10;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
        Double expected = Double.NaN;
        assertEquals(expected, result.getAzimuth(), 1e-6);
    }

    @Test
    public void calculateSolarPosition_WithInvalidLongitude_ReturnsNaN() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 37.7749;
        double longitude = 180;
        double deltaT = 10;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
        Double expected = Double.NaN;
        assertEquals(expected, result.getAzimuth(), 1e-6);
    }

    @Test
    public void calculateSolarPosition_WithNegativeDeltaT_ReturnsNaN() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 37.7749;
        double longitude = -122.4194;
        double deltaT = -10;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
        Double expected = Double.NaN;
        assertEquals(expected, result.getAzimuth(), 1e-6);
    }

    @Test
    public void calculateSolarPosition_WithHighPressure_ReturnsNaN() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 37.7749;
        double longitude = -122.4194;
        double deltaT = 10;
        double pressure = Double.POSITIVE_INFINITY;
        double temperature = 20;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);
        Double expected = Double.NaN;
        assertEquals(expected, result.getAzimuth(), 1e-6);
    }

    @Test
    public void calculateSolarPosition_WithLowPressure_ReturnsNaN() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 37.7749;
        double longitude = -122.4194;
        double deltaT = 10;
        double pressure = Double.NEGATIVE_INFINITY;
        double temperature = 20;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);
        Double expected = Double.NaN;
        assertEquals(expected, result.getAzimuth(), 1e-6);
    }

    @Test
    public void calculateSolarPosition_WithNegativeTemperature_ReturnsNaN() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 37.7749;
        double longitude = -122.4194;
        double deltaT = 10;
        double pressure = 1013.25;
        double temperature = Double.NEGATIVE_INFINITY;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);
        Double expected = Double.NaN;
        assertEquals(expected, result.getAzimuth(), 1e-6);
    }

    @Test
    public void calculateSolarPosition_WithZeroTemperature_ReturnsNaN() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 37.7749;
        double longitude = -122.4194;
        double deltaT = 10;
        double pressure = 1013.25;
        double temperature = 0;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);
        Double expected = Double.NaN;
        assertEquals(expected, result.getAzimuth(), 1e-6);
    }

}