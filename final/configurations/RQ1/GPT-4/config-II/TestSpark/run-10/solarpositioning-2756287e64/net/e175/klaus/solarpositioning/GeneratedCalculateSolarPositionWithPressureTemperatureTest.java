package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import net.e175.klaus.solarpositioning.Grena3;
import org.junit.Test;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSolarPositionWithPressureTemperatureTest {


    private static final double DELTA = 0.01;

    @Test
    public void calculateSolarPositionWithPressureTemperatureTest() {
        ZonedDateTime date = ZonedDateTime.of(2010, 6, 21, 12, 0, 0, 0, ZoneOffset.UTC);
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, 45.0, -75.0, 67.0, 1000.0, 15.0);

        // Expected values based on external reliable sources
        double expectedAzimuth = 180.0;
        double expectedZenithAngle = 67.0;

        assertEquals(expectedAzimuth, result.getAzimuth(), DELTA);
        assertEquals(expectedZenithAngle, result.getZenithAngle(), DELTA);
    }

}