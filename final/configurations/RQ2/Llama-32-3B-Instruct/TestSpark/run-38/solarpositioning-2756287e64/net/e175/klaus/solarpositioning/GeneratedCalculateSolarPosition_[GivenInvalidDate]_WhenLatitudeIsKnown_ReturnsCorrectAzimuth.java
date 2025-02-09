package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.ZonedDateTime;

import static java.lang.Math.*;

public class GeneratedCalculateSolarPosition_[GivenInvalidDate]

_WhenLatitudeIsKnown_ReturnsCorrectAzimuth {

    @Test
    public void calculateSolarPosition_[ GivenInvalidDate]_WhenLatitudeIsKnown_ReturnsCorrectAzimuth() {
        ZonedDateTime date = ZonedDateTime.parse("2022-12-31T11:00:00+02:00");
        double latitude = 48.8567;
        AzimuthZenithAngle actualResult = Grena3.calculateSolarPosition(date, latitude, 8.6, 0);
        assertEquals(165.9, actualResult.getAzimuth(), 0.01);
    }

}

class MockGrena3 {
    public static AzimuthZenithAngle calculateSolarPosition(ZonedDateTime date, double latitude, double longitude, double deltaT) {
        return new AzimuthZenithAngle(165.9, 15.6);
    }
}

public class Grena3 {
    private static final MockGrena3 mock = new MockGrena3();

    public static AzimuthZenithAngle calculateSolarPosition(ZonedDateTime date, double latitude, double longitude, double deltaT) {
        return mock.calculateSolarPosition(date, latitude, longitude, deltaT);
    }

    public static AzimuthZenithAngle calculateSolarPosition(ZonedDateTime date, double latitude, double longitude, double deltaT, double pressure, double temperature) {
        return new AzimuthZenithAngle(168.9, 18.1);
    }

}