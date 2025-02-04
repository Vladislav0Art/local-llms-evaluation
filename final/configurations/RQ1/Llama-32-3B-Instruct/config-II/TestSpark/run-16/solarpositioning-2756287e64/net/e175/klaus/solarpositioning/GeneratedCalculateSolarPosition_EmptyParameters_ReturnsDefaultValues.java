package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSolarPosition_EmptyParameters_ReturnsDefaultValues {

    @Test
    public void calculateSolarPosition_EmptyParameters_ReturnsDefaultValues() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 0;
        double longitude = 0;
        double deltaT = 0;
        double pressure = 1000;
        double temperature = 20;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);
        assertEquals(180.0, result.getAzimuth(), 1e-6);
        assertEquals(0.0, result.getZenith(), 1e-6);
    }

}