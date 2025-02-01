package net.e175.klaus.solarpositioning;

import org.junit.Assert;
import org.junit.Test;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class GeneratedCalculateSolarPositionWithPressureTemperatureValidTest {

    @Test
    public void calculateSolarPositionWithPressureTemperatureValidTest() {
        ZonedDateTime date = ZonedDateTime.of(2020, 4, 12, 6, 0, 0, 0, ZoneOffset.UTC);
        double latitude = 36.72016;
        double longitude = -4.42034;
        double deltaT = 64.8;
        double pressure = 1010.0;
        double temperature = 20.0;
        AzimuthZenithAngle expected = new AzimuthZenithAngle(124.88092460206449, 36.282936208434935);

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);

        Assert.assertEquals(expected, result);
    }

}