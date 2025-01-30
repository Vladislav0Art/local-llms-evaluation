package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.ZonedDateTime;

import static org.junit.Assert.assertEquals;
import static java.time.ZoneOffset.UTC;

public class GeneratedTest {

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

    @Test
    public void calculateSolarPositionWithZeroPressureAndTemperatureTest() {
        ZonedDateTime date = ZonedDateTime.of(2015, 5, 20, 12, 0, 0, 0, UTC);
        double latitude = 40.712776;
        double longitude = -74.005974;
        double deltaT = 0;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, 0, 0);
        // assert values based on the expected result
        assertEquals(199.0416719017211, result.getAzimuth(), 0.01);
        assertEquals(67.63258122993914, result.getZenithAngle(), 0.01);
    }

}