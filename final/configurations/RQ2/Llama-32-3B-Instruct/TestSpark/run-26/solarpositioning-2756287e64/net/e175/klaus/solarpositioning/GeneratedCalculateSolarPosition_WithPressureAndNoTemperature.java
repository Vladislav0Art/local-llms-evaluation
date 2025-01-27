package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import static java.lang.Math.*;

public class GeneratedCalculateSolarPosition_WithPressureAndNoTemperature {

    @Test
    public void calculateSolarPosition_WithPressureAndNoTemperature() {
        ZonedDateTime date = ZonedDateTime.of(2022, 6, 1, 0, 0, 0, 0, ZoneOffset.UTC);
        double latitude = 40.7128;
        double longitude = -74.0060;
        double deltaT = 10.5;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure:1013.25);
        assertNotNull(result);
    }

}