package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSolarPosition_InvalidTemperature_ReturnsDefaultValues {

    @Test
    public void calculateSolarPosition_InvalidTemperature_ReturnsDefaultValues() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 45;
        double longitude = 60;
        double deltaT = 100;
        double pressure = 1500;
        double temperature = -500;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);
        assertEquals(180.0, result.getAzimuth(), 1e-6);
        assertEquals(0.0, result.getZenith(), 1e-6);
    }

}

class AzimuthZenithAngle {
    private double azimuth;
    private double zenith;

    public double getAzimuth() {
        return azimuth;
    }

    public double getZenith() {
        return zenith;
    }

}