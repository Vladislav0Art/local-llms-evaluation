package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.ZonedDateTime;

import static org.junit.Assert.*;

public class GeneratedCalculateSolarPositionRefractionDisabledTest {

    @Test
    public void calculateSolarPositionRefractionDisabledTest() {
        ZonedDateTime date = ZonedDateTime.of(2110, 12, 31, 23, 59, 59, 0, ZoneOffset.UTC);
        double latitude = 0.00;
        double longitude = 0.00;
        double deltaT = 0;
        double pressure = -3000;
        double temperature = -280;

        // execute target method
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);

        // verify result
        assertNotNull(result);
        assertTrue(result.getAzimuth() >= 0);
        assertTrue(result.getZenithAngle() >= 0);
    }

}