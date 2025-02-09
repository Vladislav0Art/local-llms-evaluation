package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZonedDateTime;

import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import net.e175.klaus.solarpositioning.Grena3;

public class GeneratedCalculateSolarPositionDateLatitudeLongitudeDeltaTPressureTemperatureWithNullDateTest {

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