package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import static java.lang.Math.*;

public class GeneratedCalculateSolarPosition_CalculatesSolarPositionWithCorrectDateAndTime {

    @Test
    public void calculateSolarPosition_CalculatesSolarPositionWithCorrectDateAndTime() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 37.7749;
        double longitude = -122.4194;
        AzimuthZenithAngle actual = Grena3.calculateSolarPosition(date, latitude, longitude, 0);
        assertEquals(AzimuthZenithAngle.ZERO, actual, 1e-6);
    }

}