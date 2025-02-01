package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.ZonedDateTime;

import static org.junit.Assert.*;

public class GeneratedCalculateSolarPositionFourParametersTest {

    @Test
    public void calculateSolarPositionFourParametersTest() {
        ZonedDateTime date = ZonedDateTime.of(2110, 12, 31, 23, 59, 59, 0, ZoneOffset.UTC);
        double latitude = -89.99;
        double longitude = 179.99;
        double deltaT = -1000;

        // execute target method
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);

        // verify result
        assertNotNull(result);
        assertTrue(result.getAzimuth() >= 0);
        assertTrue(result.getZenithAngle() >= 0);
    }

}