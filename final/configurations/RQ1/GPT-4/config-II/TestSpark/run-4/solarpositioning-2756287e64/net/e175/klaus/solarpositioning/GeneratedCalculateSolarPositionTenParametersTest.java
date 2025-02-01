package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.ZonedDateTime;

import static org.junit.Assert.*;

public class GeneratedCalculateSolarPositionTenParametersTest {

    @Test
    public void calculateSolarPositionTenParametersTest() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 89.99;
        double longitude = -179.99;
        double deltaT = 1000;
        double pressure = 500;
        double temperature = 100;

        // execute target method
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);

        // verify result
        assertNotNull(result);
        assertTrue(result.getAzimuth() >= 0);
        assertTrue(result.getZenithAngle() >= 0);
    }

}