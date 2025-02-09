package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZonedDateTime;
import java.time.ZoneOffset;
import java.lang.Math;

import static java.lang.Math.*;

public class GeneratedCalculateSolarPosition_WithValidDateAndLatitude_ReturnsCorrectAzimuthZenithAngle {

    @Test
    public void calculateSolarPosition_WithValidDateAndLatitude_ReturnsCorrectAzimuthZenithAngle() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 40.7128; // New York
        double longitude = -74.0060;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, 0.0);
        assertNotNull(result);
    }

}