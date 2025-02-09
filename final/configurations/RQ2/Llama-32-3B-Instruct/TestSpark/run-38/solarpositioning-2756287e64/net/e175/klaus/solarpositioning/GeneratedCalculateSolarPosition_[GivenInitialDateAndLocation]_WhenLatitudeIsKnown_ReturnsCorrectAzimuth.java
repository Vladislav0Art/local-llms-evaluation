package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.ZonedDateTime;

import static java.lang.Math.*;

public class GeneratedCalculateSolarPosition_[GivenInitialDateAndLocation]

_WhenLatitudeIsKnown_ReturnsCorrectAzimuth {

    @Test
    public void calculateSolarPosition_[ GivenInitialDateAndLocation]_WhenLatitudeIsKnown_ReturnsCorrectAzimuth() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 48.8567;
        AzimuthZenithAngle actualResult = Grena3.calculateSolarPosition(date, latitude, 8.6, 0);
        assertEquals(165.9, actualResult.getAzimuth(), 0.01);
    }

}