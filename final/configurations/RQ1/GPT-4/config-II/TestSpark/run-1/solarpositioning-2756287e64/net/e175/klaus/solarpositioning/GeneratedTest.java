package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import net.e175.klaus.solarpositioning.Grena3;
import org.junit.Assert;
import org.junit.Test;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class GeneratedTest {

    private static final double DELTA = 0.001;
    private static final double REFRACTED_DELTA = 0.5;

    @Test
    public void calculateSolarPositionValidValuesTest() {
        ZonedDateTime date = ZonedDateTime.of(2020, 12, 21, 12, 0, 0, 0, ZoneId.of("UTC"));
        double latitude = 51.4826; // Royal Observatory, Greenwich
        double longitude = 0.0077; // Royal Observatory, Greenwich
        double deltaT = 69.4; // For 2020

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
        Assert.assertEquals(179.056, result.getAzimuth(), DELTA);
        Assert.assertEquals(28.780, result.getZenithAngle(), DELTA);
    }

    @Test
    public void calculateSolarPositionMinimumYearsTest() {
        ZonedDateTime date = ZonedDateTime.of(2010, 1, 1, 12, 0, 0, 0, ZoneId.of("UTC"));
        double latitude = -90.0; // South Pole
        double longitude = 0.0;
        double deltaT = 66.3; // For 2010

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
        Assert.assertEquals(180.001, result.getAzimuth(), DELTA);
        Assert.assertEquals(22.454, result.getZenithAngle(), DELTA);
    }

    @Test
    public void calculateSolarPositionMaximumYearsTest() {
        ZonedDateTime date = ZonedDateTime.of(2110, 12, 31, 12, 0, 0, 0, ZoneId.of("UTC"));
        double latitude = 90.0; // North Pole
        double longitude = 0.0;
        double deltaT = 151.7; // Estimated for 2110

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
        Assert.assertEquals(0.0, result.getAzimuth(), DELTA);
        Assert.assertEquals(23.796, result.getZenithAngle(), DELTA);
    }

    @Test
    public void calculateSolarPositionWithRefractionCorrectionTest() {
        ZonedDateTime date = ZonedDateTime.of(2020, 12, 21, 12, 0, 0, 0, ZoneId.of("UTC"));
        double latitude = 51.4826; // Royal Observatory, Greenwich
        double longitude = 0.0077; // Royal Observatory, Greenwich
        double deltaT = 69.4; // For 2020
        double pressure = 1000.0; // Standard pressure in millibars
        double temperature = 15.0; // Average temperature in degrees Celsius

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);
        Assert.assertEquals(179.056, result.getAzimuth(), DELTA);
        Assert.assertEquals(28.780, result.getZenithAngle(), DELTA);
    }

    @Test
    public void calculateSolarPositionWithExtremePressureAndTemperatureTest() {
        ZonedDateTime date = ZonedDateTime.of(2020, 12, 21, 12, 0, 0, 0, ZoneId.of("UTC"));
        double latitude = 51.4826; // Royal Observatory, Greenwich
        double longitude = 0.0077; // Royal Observatory, Greenwich
        double deltaT = 69.4; // For 2020
        double pressure = -500.0; // Invalid pressure
        double temperature = 500.0; // Extreme temperature

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);
        Assert.assertEquals(179.056, result.getAzimuth(), DELTA);
        Assert.assertEquals(28.780, result.getZenithAngle(), DELTA);
    }

}