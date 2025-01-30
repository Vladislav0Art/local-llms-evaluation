package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.ZonedDateTime;

import static org.junit.Assert.assertEquals;
import static java.time.ZoneOffset.UTC;

public class GeneratedCalculateSolarPositionWithZeroPressureAndTemperatureTest {

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