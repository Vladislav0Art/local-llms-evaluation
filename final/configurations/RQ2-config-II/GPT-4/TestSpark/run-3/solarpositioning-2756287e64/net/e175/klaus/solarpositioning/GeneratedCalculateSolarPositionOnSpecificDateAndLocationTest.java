package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.time.ZonedDateTime;

public class GeneratedCalculateSolarPositionOnSpecificDateAndLocationTest {

    @Test
    public void calculateSolarPositionOnSpecificDateAndLocationTest() {
        ZonedDateTime date = ZonedDateTime.of(2021, 9, 3, 10, 0, 0, 0, ZoneOffset.UTC);
        double latitude = 39.9537282;
        double longitude = -75.1635262;
        double deltaT = 64.0;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);

        // expected values are computed using reference implementations or actual observed data
        double expectedAzimuth = 110.545;
        double expectedZenithAngle = 20.483;

        assertEquals(expectedZenithAngle, result.getZenithAngle(), 0.001);
        assertEquals(expectedAzimuth, result.getAzimuth(), 0.001);
    }

}