package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import static java.lang.Math.*;

public class GeneratedCalculateSolarPosition_Atomically_ReturnsExpectedValue_WrongDeltaT {

    @Test
    public void calculateSolarPosition_Atomically_ReturnsExpectedValue_WrongDeltaT() {
        ZonedDateTime date = ZonedDateTime.of(2022, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC);
        double latitude = 45.0;
        double longitude = -120.0;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, 0.0, 10000.0, -20.0);
        assertEquals(270.0, result.getAzimuth(), 1e-6);
    }

}