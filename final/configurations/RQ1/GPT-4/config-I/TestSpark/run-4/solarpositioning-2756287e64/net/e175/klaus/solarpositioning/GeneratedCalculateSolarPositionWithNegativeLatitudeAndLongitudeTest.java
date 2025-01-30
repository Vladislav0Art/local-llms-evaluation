package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.ZonedDateTime;
import java.time.ZoneId;

public class GeneratedCalculateSolarPositionWithNegativeLatitudeAndLongitudeTest {

    private static final double DELTA = 1e-6;

    @Test
    public void calculateSolarPositionWithNegativeLatitudeAndLongitudeTest() {
        ZonedDateTime testDate = ZonedDateTime.of(2015, 3, 7, 16, 30, 0, 0, ZoneId.of("UTC"));
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(testDate, -40.2, -17.3, 68.1);

        assertEquals(233.300612955441, result.getAzimuth(), DELTA);
        assertEquals(46.21760707748867, result.getZenithAngle(), DELTA);
    }

}