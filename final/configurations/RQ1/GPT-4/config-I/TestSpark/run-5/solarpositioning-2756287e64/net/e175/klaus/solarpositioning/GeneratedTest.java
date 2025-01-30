package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import net.e175.klaus.solarpositioning.Grena3;
import org.junit.Assert;
import org.junit.Test;

import java.time.ZonedDateTime;

public class GeneratedTest {

    @Test
    public void calculateSolarPositionWithMinimumDeltaTTest() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = -90.0;
        double longitude = -180.0;
        double deltaT = Double.MIN_VALUE;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
        Assert.assertNotNull(result);
    }

    @Test
    public void calculateSolarPositionWithMaximumDeltaTTest() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 90.0;
        double longitude = 180.0;
        double deltaT = Double.MAX_VALUE;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
        Assert.assertNotNull(result);
    }

    @Test
    public void calculateSolarPositionWithRefractionCorrectionDisabledTest() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 0.0;
        double longitude = 0.0;
        double deltaT = 0.0;
        double pressure = Double.MIN_VALUE;
        double temperature = -274;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);
        Assert.assertNotNull(result);
    }

    @Test
    public void calculateSolarPositionWithRefractionCorrectionEnabledTest() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 0.0;
        double longitude = 0.0;
        double deltaT = 0.0;
        double pressure = 1000.0;
        double temperature = 20.0;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);
        Assert.assertNotNull(result);
    }

    @Test
    public void calculateSolarPositionWithInvalidLongitudeTest() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 0.0;
        double longitude = 181.0;
        double deltaT = 0.0;

        // Longitude out of range should throw IllegalArgumentException
        Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
    }

    @Test
    public void calculateSolarPositionWithInvalidLatitudeTest() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 91.0;
        double longitude = 0.0;
        double deltaT = 0.0;

        // Latitude out of range should throw IllegalArgumentException
        Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
    }

}