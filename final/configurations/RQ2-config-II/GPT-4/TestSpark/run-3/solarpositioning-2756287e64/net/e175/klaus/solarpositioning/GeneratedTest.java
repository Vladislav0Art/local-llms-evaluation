package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.time.ZonedDateTime;

public class GeneratedTest {

    @Test
    public void calculateSolarPositionWithFourParametersTest() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 65.05;
        double longitude = 25.4667;
        double deltaT = 67.0;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);

        assertNotNull(result);
    }

    @Test
    public void calculateSolarPositionWithSixParametersTest() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 65.05;
        double longitude = 25.4667;
        double deltaT = 67.0;
        double pressure = 1013.25;
        double temperature = 15.0;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);

        assertNotNull(result);
    }

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