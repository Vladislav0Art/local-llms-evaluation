package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZonedDateTime;
import java.time.ZoneOffset;
import java.lang.Math;

public class GeneratedCalculateSolarPosition_NullDate_PressureAndTemperature {

    public enum AzimuthZenithAngle {
        SOFTMAX,
        // Add other angles here
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