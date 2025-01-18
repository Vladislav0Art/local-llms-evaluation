package net.e175.klaus.solarpositioning;

import org.junit.Test;
import net.e175.klaus.solarpositioning.Grena3;
import net.e175.klaus.solarpositioning.AzimuthZenithAngle;

import java.time.ZonedDateTime;

import static org.junit.Assert.*;

public class GeneratedCalculateSolarPositionNullDateLatitudeLongitudeDeltaTTest {

    @Test
    public void calculateSolarPositionNullDateLatitudeLongitudeDeltaTTest() {
        final ZonedDateTime date = null;
        final double latitude = 64.1265;
        final double longitude = -21.8174;
        final double deltaT = 69.0;

        try {
            Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected exception
        }
    }

}