package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void calculateSolarPositionNoDateTest() {
        assertEquals(AzimuthZenithAngle.NONE, Grena3.calculateSolarPosition(ZonedDateTime.of(2020, 1, 1, 12, 0, 0, 0, ZoneOffset.UTC), 40.8, -74.5, 4));
    }

    @Test
    public void calculateSolarPositionInvalidDateTest() {
        assertEquals(AzimuthZenithAngle.NONE, Grena3.calculateSolarPosition(ZonedDateTime.of(2020, 1, 32, 12, 0, 0, 0, ZoneOffset.UTC), 40.8, -74.5, 4));
    }

    @Test
    public void calculateSolarPositionNoLatitudeTest() {
        assertEquals(AzimuthZenithAngle.NONE, Grena3.calculateSolarPosition(ZonedDateTime.of(2020, 1, 1, 12, 0, 0, 0, ZoneOffset.UTC), 0.0, -74.5, 4));
    }

    @Test
    public void calculateSolarPositionNoLongitudeTest() {
        assertEquals(AzimuthZenithAngle.NONE, Grena3.calculateSolarPosition(ZonedDateTime.of(2020, 1, 1, 12, 0, 0, 0, ZoneOffset.UTC), 40.8, 0.0, 4));
    }

    @Test
    public void calculateSolarPositionNoDeltaTTest() {
        assertEquals(AzimuthZenithAngle.NONE, Grena3.calculateSolarPosition(ZonedDateTime.of(2020, 1, 1, 12, 0, 0, 0, ZoneOffset.UTC), 40.8, -74.5, 0));
    }

    @Test
    public void calculateSolarPositionNoPressureTest() {
        assertEquals(AzimuthZenithAngle.NONE, Grena3.calculateSolarPosition(ZonedDateTime.of(2020, 1, 1, 12, 0, 0, 0, ZoneOffset.UTC), 40.8, -74.5, 4, 101325, 288.15));
    }

    @Test
    public void calculateSolarPositionNoTemperatureTest() {
        assertEquals(AzimuthZenithAngle.NONE, Grena3.calculateSolarPosition(ZonedDateTime.of(2020, 1, 1, 12, 0, 0, 0, ZoneOffset.UTC), 40.8, -74.5, 4, 101325, Double.NEGATIVE_INFINITY));
    }

    @Test
    public void calculateSolarPositionWithValidInputTest() {
        ZonedDateTime date = ZonedDateTime.of(2020, 1, 1, 12, 0, 0, 0, ZoneOffset.UTC);
        double latitude = 40.8;
        double longitude = -74.5;
        double deltaT = 4;
        double pressure = 101325;
        double temperature = 288.15;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);
        // verify result
    }

    @Test
    public void calculateSolarPositionWithZeroPressureAndValidTemperatureTest() {
        ZonedDateTime date = ZonedDateTime.of(2020, 1, 1, 12, 0, 0, 0, ZoneOffset.UTC);
        double latitude = 40.8;
        double longitude = -74.5;
        double deltaT = 4;
        double pressure = 0;
        double temperature = 288.15;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);
        // verify result
    }

    @Test
    public void calculateSolarPositionWithNegativePressureAndValidTemperatureTest() {
        ZonedDateTime date = ZonedDateTime.of(2020, 1, 1, 12, 0, 0, 0, ZoneOffset.UTC);
        double latitude = 40.8;
        double longitude = -74.5;
        double deltaT = 4;
        double pressure = Double.NEGATIVE_INFINITY;
        double temperature = 288.15;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);
        // verify result
    }

}

public class AzimuthZenithAngle {
    public static final AzimuthZenithAngle NONE = new AzimuthZenithAngle(0.0, 0.0);

    private double azimuth;
    private double zenith;

    public AzimuthZenithAngle(double azimuth, double zenith) {
        this.azimuth = azimuth;
        this.zenith = zenith;
    }

}