package net.e175.klaus.solarpositioning;

import org.junit.Assert;
import org.junit.Test;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class GeneratedCalculateSolarPositionTomorrowValidTest {

    @Test
    public void calculateSolarPositionTomorrowValidTest() {
        ZonedDateTime date = ZonedDateTime.of(2020, 4, 13, 6, 0, 0, 0, ZoneOffset.UTC);
        double latitude = 36.72016;
        double longitude = -4.42034;
        double deltaT = 64.8;
        AzimuthZenithAngle expected = new AzimuthZenithAngle(120.58861970891544, 34.97561012690542);

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);

        Assert.assertEquals(expected, result);
    }

}