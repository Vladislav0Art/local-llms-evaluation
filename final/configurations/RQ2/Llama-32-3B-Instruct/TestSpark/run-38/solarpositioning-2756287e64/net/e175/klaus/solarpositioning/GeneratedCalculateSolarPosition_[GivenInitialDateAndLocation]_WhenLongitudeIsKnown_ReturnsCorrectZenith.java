package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.ZonedDateTime;

import static java.lang.Math.*;

public class GeneratedCalculateSolarPosition_[GivenInitialDateAndLocation]

_WhenLongitudeIsKnown_ReturnsCorrectZenith {

    @Test
    public void calculateSolarPosition_[ GivenInitialDateAndLocation]_WhenLongitudeIsKnown_ReturnsCorrectZenith() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 48.8567;
        double longitude = 8.6;
        AzimuthZenithAngle actualResult = Grena3.calculateSolarPosition(date, latitude, longitude, 0);
        assertEquals(15.6, actualResult.getZenith(), 0.01);
    }

}