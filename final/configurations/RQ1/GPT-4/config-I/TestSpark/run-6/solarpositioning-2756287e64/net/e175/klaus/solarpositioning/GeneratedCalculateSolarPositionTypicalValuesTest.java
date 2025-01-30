package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedCalculateSolarPositionTypicalValuesTest {

    private static final double DELTA = 0.01;

    @Test
    public void calculateSolarPositionTypicalValuesTest() {
        ZonedDateTime date = ZonedDateTime.of(2020, 8, 1, 12, 0, 0, 0, ZoneOffset.UTC);
        AzimuthZenithAngle solarPosition = Grena3.calculateSolarPosition(date, 50, 20, 68, 1010, 20);
        assertEquals(180, solarPosition.getAzimuth(), DELTA);
        assertEquals(30, solarPosition.getZenithAngle(), DELTA);
    }

}