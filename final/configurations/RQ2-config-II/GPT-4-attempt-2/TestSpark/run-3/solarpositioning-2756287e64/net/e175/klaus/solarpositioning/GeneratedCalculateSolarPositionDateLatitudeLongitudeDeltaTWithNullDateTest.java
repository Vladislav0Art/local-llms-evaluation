package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZonedDateTime;

import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import net.e175.klaus.solarpositioning.Grena3;

public class GeneratedCalculateSolarPositionDateLatitudeLongitudeDeltaTWithNullDateTest {

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

}