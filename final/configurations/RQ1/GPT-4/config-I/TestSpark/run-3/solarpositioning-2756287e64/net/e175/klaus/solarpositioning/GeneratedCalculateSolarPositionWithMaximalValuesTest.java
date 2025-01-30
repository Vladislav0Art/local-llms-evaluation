package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.ZonedDateTime;

import static org.junit.Assert.assertEquals;
import static java.time.ZoneOffset.UTC;

public class GeneratedCalculateSolarPositionWithMaximalValuesTest {

    @Test
    public void calculateSolarPositionWithMaximalValuesTest() {
        ZonedDateTime date = ZonedDateTime.of(2110, 12, 31, 23, 59, 59, 999999999, UTC);
        double latitude = 90;
        double longitude = 180;
        double deltaT = Double.MAX_VALUE;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, 3000.0, 273);
        // assert values based on the expected result
        assertEquals(186.11594074510923, result.getAzimuth(), 0.01);
        assertEquals(88.63645972523547, result.getZenithAngle(), 0.01);
    }

}