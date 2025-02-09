package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.ZonedDateTime;

import static java.lang.Math.*;

public class GeneratedCalculateSolarPosition_[GivenInitialDateAndLocation]

_WhenDeltaTIsKnown_ReturnsCorrectAzimuth {

    @Test
    public void calculateSolarPosition_[ GivenInitialDateAndLocation]_WhenDeltaTIsKnown_ReturnsCorrectAzimuth() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 48.8567;
        double longitude = 8.6;
        AzimuthZenithAngle actualResult = Grena3.calculateSolarPosition(date, latitude, longitude, -0.5);
        assertEquals(170.1, actualResult.getAzimuth(), 0.01);
    }

}