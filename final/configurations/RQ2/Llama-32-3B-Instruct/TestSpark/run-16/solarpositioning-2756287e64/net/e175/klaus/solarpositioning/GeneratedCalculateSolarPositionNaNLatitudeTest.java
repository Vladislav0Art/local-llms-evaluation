package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.lang.Math;

public class GeneratedCalculateSolarPositionNaNLatitudeTest {

    @Test
    public void calculateSolarPositionNaNLatitudeTest() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = Double.NaN;
        double longitude = 0.0;
        double deltaT = 0.0;
        try {
            Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
            assert false;
        } catch (ArithmeticException e) {
            assertTrue(true);
        }
    }

}