package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.Grena3;
import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import org.junit.Test;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSolarPositionWithPositiveLatAndLongTest {

    private static final double DELTA = 0.01;

    @Test
    public void calculateSolarPositionWithPositiveLatAndLongTest() {
        ZonedDateTime date = ZonedDateTime.of(2021, 6, 21, 12, 0, 0, 0, ZoneId.of("UTC"));
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, 50, 50, 50);
        assertEquals(209.4, result.getAzimuth(), DELTA);
        assertEquals(30.9, result.getZenithAngle(), DELTA);
    }

}