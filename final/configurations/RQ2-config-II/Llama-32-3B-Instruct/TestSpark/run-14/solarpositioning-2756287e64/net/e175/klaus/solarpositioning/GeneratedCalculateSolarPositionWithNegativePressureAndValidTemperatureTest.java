package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import org.mockito.Mockito;

public class GeneratedCalculateSolarPositionWithNegativePressureAndValidTemperatureTest {

    @Test
    public void calculateSolarPositionWithNegativePressureAndValidTemperatureTest() {
        ZonedDateTime date = ZonedDateTime.of(2020, 1, 1, 12, 0, 0, 0, ZoneOffset.UTC);
        double latitude = 40.8;
        double longitude = -74.5;
        double deltaT = 4;
        double pressure = Double.NEGATIVE_INFINITY;
        double temperature = 288.15;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);
        // verify result
    }

}

public class AzimuthZenithAngle {
    public static final AzimuthZenithAngle NONE = new AzimuthZenithAngle(0.0, 0.0);

    private double azimuth;
    private double zenith;

    public AzimuthZenithAngle(double azimuth, double zenith) {
        this.azimuth = azimuth;
        this.zenith = zenith;
    }

}