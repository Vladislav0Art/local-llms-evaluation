package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.ZonedDateTime;

import static org.junit.Assert.assertEquals;
import static java.time.ZoneOffset.UTC;

public class GeneratedCalculateSolarPositionWithMinimalValuesTest {

    @Test
    public void calculateSolarPositionWithMinimalValuesTest() {
        ZonedDateTime date = ZonedDateTime.of(2010, 1, 1, 1, 1, 1, 1, UTC);
        double latitude = -90;
        double longitude = -180;
        double deltaT = Double.MIN_VALUE;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, Double.MIN_VALUE, Double.MIN_VALUE);
        // assert values based on the expected result
        assertEquals(50.933152317044996, result.getAzimuth(), 0.01);
        assertEquals(163.01877649194233, result.getZenithAngle(), 0.01);
    }

}