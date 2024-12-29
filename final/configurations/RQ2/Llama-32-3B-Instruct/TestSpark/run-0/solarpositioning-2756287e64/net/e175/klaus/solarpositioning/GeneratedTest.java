package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZonedDateTime;
import java.time.ZoneOffset;
import java.lang.Math;

public class GeneratedTest {

    public enum AzimuthZenithAngle {
        SOFTMAX,
        DEFAULT,
        OTHER
    }

    public class GeneratedAzimuthZenithAngle extends AzimuthZenithAngle {
    }

    @Test
    public void calculateSolarPosition_ValidInputs_Calculate() {
        ZonedDateTime date = ZonedDateTime.of(2022, 1, 15, 12, 0, 0, 0, ZoneOffset.UTC);
        double latitude = 37.7749;
        double longitude = -122.4194;
        double deltaT = 0.0;
        AzimuthZenithAngle angle = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
        assertNotNull(angle);
    }

    @Test
    public void calculateSolarPosition_ValidInputs_PressureAndTemperature() {
        ZonedDateTime date = ZonedDateTime.of(2022, 1, 15, 12, 0, 0, 0, ZoneOffset.UTC);
        double latitude = 37.7749;
        double longitude = -122.4194;
        double deltaT = 0.0;
        double pressure = 101325.0;
        double temperature = 20.0;
        AzimuthZenithAngle angle = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);
        assertNotNull(angle);
    }

    @Test
    public void calculateSolarPosition_InvalidInputs_PressureAndTemperature() {
        ZonedDateTime date = ZonedDateTime.of(2022, 1, 15, 12, 0, 0, 0, ZoneOffset.UTC);
        double latitude = 37.7749;
        double longitude = -122.4194;
        double deltaT = 0.0;
        double pressure = Double.POSITIVE_INFINITY;
        double temperature = 20.0;
        try {
            Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);
            fail("Expected Exception");
        } catch (Exception e) {
        }
    }

    @Test
    public void calculateSolarPosition_NullDate_PressureAndTemperature() {
        ZonedDateTime date = null;
        double latitude = 37.7749;
        double longitude = -122.4194;
        double deltaT = 0.0;
        double pressure = 101325.0;
        double temperature = 20.0;
        try {
            Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
        }
    }

}