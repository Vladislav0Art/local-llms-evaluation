package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.lang.Math;

public class GeneratedCalculateSolarPositionNaNDeltaTTest {

    @Test
    public void calculateSolarPositionNaNDeltaTTest() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 0.0;
        double longitude = 0.0;
        double deltaT = Double.NaN;
        try {
            Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
            assert false;
        } catch (ArithmeticException e) {
            assertTrue(true);
        }
    }

}