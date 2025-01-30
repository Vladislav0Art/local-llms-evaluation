package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.ZonedDateTime;
import java.time.ZoneId;

public class GeneratedCalculateSolarPositionWithPositiveLatitudeAndLongitudeTest {

    private static final double DELTA = 1e-6;

    @Test
    public void calculateSolarPositionWithPositiveLatitudeAndLongitudeTest() {
        ZonedDateTime testDate = ZonedDateTime.of(2015, 3, 7, 16, 30, 0, 0, ZoneId.of("UTC"));
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(testDate, 70.2, 30.3, 68.1);

        assertEquals(235.87418793309308, result.getAzimuth(), DELTA);
        assertEquals(123.2661205004988, result.getZenithAngle(), DELTA);
    }

}