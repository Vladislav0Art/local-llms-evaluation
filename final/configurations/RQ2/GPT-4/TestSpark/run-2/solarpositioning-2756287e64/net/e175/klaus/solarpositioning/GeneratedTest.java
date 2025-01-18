package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.Assert;

import java.time.ZonedDateTime;
import java.time.ZoneOffset;

public class GeneratedTest {

    @Test
    public void calculateSolarPositionWithFourParamsTest() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 48.21;
        double longitude = 16.37;
        double deltaT = 69;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);

        Assert.assertNotNull(result);
    }

    @Test
    public void calculateSolarPositionWithFourParamsInvalidLatTest() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 98.21;
        double longitude = 16.37;
        double deltaT = 69;

        Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
    }

    @Test
    public void calculateSolarPositionWithSixParamsTest() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 48.21;
        double longitude = 16.37;
        double deltaT = 69;
        double pressure = 1013.25;
        double temperature = 21;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);

        Assert.assertNotNull(result);
    }

    @Test
    public void calculateSolarPositionWithSixParamsInvalidLatTest() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 98.21;
        double longitude = 16.37;
        double deltaT = 69;
        double pressure = 1013.25;
        double temperature = 21;

        Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);
    }

}