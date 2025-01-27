package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.ZonedDateTime;

import static java.lang.Math.*;

import net.e175.klaus.solarpositioning.Grena3;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void calculateSolarPosition_SimpleTest() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 40.0;
        double longitude = 10.0;
        double deltaT = 1.0;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
        assertNotNull(result);
    }

    @Test
    public void calculateSolarPosition_MultipleInputParametersTest() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 40.0;
        double longitude = 10.0;
        double deltaT = 1.0;
        double pressure = 1013.25;
        double temperature = 20.0;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);
        assertNotNull(result);
    }

    @Test
    public void calculateSolarPosition_IncorrectLatitudeTest() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = -40.0;
        double longitude = 10.0;
        double deltaT = 1.0;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
        assertNull(result);
    }

    @Test
    public void calculateSolarPosition_IncorrectLongitudeTest() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 40.0;
        double longitude = -10.0;
        double deltaT = 1.0;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
        assertNull(result);
    }

    @Test
    public void calculateSolarPosition_IncorrectDeltaTimeTest() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 40.0;
        double longitude = 10.0;
        double deltaT = -1.0;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
        assertNull(result);
    }

    @Test
    public void calculateSolarPosition_NullDate() {
        ZonedDateTime date = null;
        double latitude = 40.0;
        double longitude = 10.0;
        double deltaT = 1.0;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
        assertNull(result);
    }

    @Test
    public void calculateSolarPosition_EmptyDate() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 40.0;
        double longitude = 10.0;
        double deltaT = 1.0;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
        assertNotNull(result);
    }

}