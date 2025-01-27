package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import net.e175.klaus.solarpositioning.AzimuthZenithAngle;

public class GeneratedTest {

    @Test
    public void calculateSolarPosition_Date_Only_Latitude_RoundTripTest() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.ofHours(-5));
        double latitude = 45.0;
        AzimuthZenithAngle expectedResult = new AzimuthZenithAngle(0, 30);
        AzimuthZenithAngle actualResult = Grena3.calculateSolarPosition(date, latitude);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void calculateSolarPosition_Date_Pressure_Latitude_RoundTripTest() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.ofHours(-5));
        double latitude = 45.0;
        double pressure = 1000.0;
        AzimuthZenithAngle expectedResult = new AzimuthZenithAngle(10, -20);
        AzimuthZenithAngle actualResult = Grena3.calculateSolarPosition(date, latitude, pressure);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void calculateSolarPosition_Date_Temperature_Latitude_RoundTripTest() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.ofHours(-5));
        double latitude = 45.0;
        double temperature = 20.0;
        AzimuthZenithAngle expectedResult = new AzimuthZenithAngle(15, -25);
        AzimuthZenithAngle actualResult = Grena3.calculateSolarPosition(date, latitude, temperature);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void calculateSolarPosition_Date_InvalidInput_Latitude_RoundTripTest() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.ofHours(-5));
        double latitude = Double.NaN;
        AzimuthZenithAngle expectedResult = null;
        AzimuthZenithAngle actualResult = Grena3.calculateSolarPosition(date, latitude);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void calculateSolarPosition_Date_Pressure_Latitude_InvalidInput_RoundTripTest() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.ofHours(-5));
        double latitude = Double.NaN;
        double pressure = 1000.0;
        AzimuthZenithAngle expectedResult = null;
        AzimuthZenithAngle actualResult = Grena3.calculateSolarPosition(date, latitude, pressure);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void calculateSolarPosition_Date_Temperature_Latitude_InvalidInput_RoundTripTest() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.ofHours(-5));
        double latitude = Double.NaN;
        double temperature = 20.0;
        AzimuthZenithAngle expectedResult = null;
        AzimuthZenithAngle actualResult = Grena3.calculateSolarPosition(date, latitude, temperature);
        assertEquals(expectedResult, actualResult);
    }

}