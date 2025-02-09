package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.ZonedDateTime;

import static java.lang.Math.*;

public class GeneratedCalculateSolarPosition_[GivenInitialDateAndLocation]

_WhenTemperatureIsKnown_ReturnsCorrectAzimuth {

    @Test
    public void calculateSolarPosition_[ GivenInitialDateAndLocation]_WhenTemperatureIsKnown_ReturnsCorrectAzimuth() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 48.8567;
        double longitude = 8.6;
        double temperature = -5;
        AzimuthZenithAngle actualResult = Grena3.calculateSolarPosition(date, latitude, longitude, -0.5, temperature);
        assertEquals(171.1, actualResult.getAzimuth(), 0.01);
    }

}