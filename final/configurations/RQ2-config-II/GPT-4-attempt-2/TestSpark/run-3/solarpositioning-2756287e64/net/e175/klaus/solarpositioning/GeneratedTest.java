package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZonedDateTime;

import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import net.e175.klaus.solarpositioning.Grena3;

public class GeneratedTest {

    @Test
    public void calculateSolarPositionDateLatitudeLongitudeDeltaTTest() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 0.0;
        double longitude = 0.0;
        double deltaT = 0.0;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
        assertNotNull("Result is null", result);
    }

    @Test
    public void calculateSolarPositionDateLatitudeLongitudeDeltaTWithNullDateTest() {
        double latitude = 0.0;
        double longitude = 0.0;
        double deltaT = 0.0;

        try {
            Grena3.calculateSolarPosition(null, latitude, longitude, deltaT);
            fail("Expected IllegalArgumentException not thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("Date cannot be null", e.getMessage());
        }
    }

    @Test
    public void calculateSolarPositionDateLatitudeLongitudeDeltaTPressureTemperatureTest() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 0.0;
        double longitude = 0.0;
        double deltaT = 0.0;
        double pressure = 0.0;
        double temperature = 0.0;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);

        assertNotNull("Result is null", result);
    }

    @Test
    public void calculateSolarPositionDateLatitudeLongitudeDeltaTPressureTemperatureWithNullDateTest() {
        double latitude = 0.0;
        double longitude = 0.0;
        double deltaT = 0.0;
        double pressure = 0.0;
        double temperature = 0.0;

        try {
            Grena3.calculateSolarPosition(null, latitude, longitude, deltaT, pressure, temperature);
            fail("Expected IllegalArgumentException not thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("Date cannot be null", e.getMessage());
        }
    }

}