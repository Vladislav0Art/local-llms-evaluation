package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.ZonedDateTime;

import static java.lang.Math.*;

public class GeneratedCalculateSolarPosition_[GivenInitialDateAndLocation]

_WhenPressureIsKnown_ReturnsCorrectAzimuth {

    @Test
    public void calculateSolarPosition_[ GivenInitialDateAndLocation]_WhenPressureIsKnown_ReturnsCorrectAzimuth() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 48.8567;
        double longitude = 8.6;
        double pressure = 1023.25;
        AzimuthZenithAngle actualResult = Grena3.calculateSolarPosition(date, latitude, longitude, -0.5, pressure);
        assertEquals(168.9, actualResult.getAzimuth(), 0.01);
    }

}