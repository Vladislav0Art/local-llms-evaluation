package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import net.e175.klaus.solarpositioning.Grena3;
import org.junit.Assert;
import org.junit.Test;

import java.time.ZonedDateTime;

public class GeneratedTest {

    @Test
    public void calculateSolarPositionWithFourParamsTest() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 38.9072;
        double longitude = -77.0369;
        double deltaT = 67.0;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);

        Assert.assertNotNull(result);
    }

    @Test
    public void calculateSolarPositionWithNullDateFourParamsTest() {
        ZonedDateTime date = null;
        double latitude = 38.9072;
        double longitude = -77.0369;
        double deltaT = 67.0;

        Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
    }

    @Test
    public void calculateSolarPositionWithSixParamsTest() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 49.2827;
        double longitude = -123.1207;
        double deltaT = 69.0;
        double pressure = 1013.25;
        double temperature = 15.0;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);

        Assert.assertNotNull(result);
    }

    @Test
    public void calculateSolarPositionWithNullDateSixParamsTest() {
        ZonedDateTime date = null;
        double latitude = 49.2827;
        double longitude = -123.1207;
        double deltaT = 69.0;
        double pressure = 1013.25;
        double temperature = 15.0;

        Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);
    }

}