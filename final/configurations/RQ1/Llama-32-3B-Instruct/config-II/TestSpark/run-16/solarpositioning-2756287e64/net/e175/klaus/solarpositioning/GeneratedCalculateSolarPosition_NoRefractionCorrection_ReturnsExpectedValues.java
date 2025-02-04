package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSolarPosition_NoRefractionCorrection_ReturnsExpectedValues {

    @Test
    public void calculateSolarPosition_NoRefractionCorrection_ReturnsExpectedValues() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 45;
        double longitude = 60;
        double deltaT = 100;
        double pressure = 1500;
        double temperature = -10;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);
        assertEquals(120.0, result.getAzimuth(), 1e-6);
        assertEquals(-30.0, result.getZenith(), 1e-6);
    }

}