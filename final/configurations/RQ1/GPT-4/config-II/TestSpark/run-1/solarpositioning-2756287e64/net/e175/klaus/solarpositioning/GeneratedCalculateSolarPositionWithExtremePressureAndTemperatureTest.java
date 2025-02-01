package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import net.e175.klaus.solarpositioning.Grena3;
import org.junit.Assert;
import org.junit.Test;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class GeneratedCalculateSolarPositionWithExtremePressureAndTemperatureTest {

    private static final double DELTA = 0.001;
    private static final double REFRACTED_DELTA = 0.5;

    @Test
    public void calculateSolarPositionWithExtremePressureAndTemperatureTest() {
        ZonedDateTime date = ZonedDateTime.of(2020, 12, 21, 12, 0, 0, 0, ZoneId.of("UTC"));
        double latitude = 51.4826; // Royal Observatory, Greenwich
        double longitude = 0.0077; // Royal Observatory, Greenwich
        double deltaT = 69.4; // For 2020
        double pressure = -500.0; // Invalid pressure
        double temperature = 500.0; // Extreme temperature

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);
        Assert.assertEquals(179.056, result.getAzimuth(), DELTA);
        Assert.assertEquals(28.780, result.getZenithAngle(), DELTA);
    }

}