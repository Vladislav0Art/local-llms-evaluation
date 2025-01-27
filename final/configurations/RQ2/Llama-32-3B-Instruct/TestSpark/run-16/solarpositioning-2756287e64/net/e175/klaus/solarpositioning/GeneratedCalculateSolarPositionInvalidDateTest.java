package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.lang.Math;

public class GeneratedCalculateSolarPositionInvalidDateTest {

    @Test
    public void calculateSolarPositionInvalidDateTest() {
        ZonedDateTime date = null;
        double latitude = 0.0;
        double longitude = 0.0;
        double deltaT = 0.0;
        try {
            Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
            assert false;
        } catch (NullPointerException e) {
            assertTrue(true);
        }
    }

}