package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import static java.lang.Math.*;

public class GeneratedCalculateSolarPosition_DifferentValues_ReturnsAzimuthZenithAngle {

    @Test
    public void calculateSolarPosition_DifferentValues_ReturnsAzimuthZenithAngle() {
        ZonedDateTime date = ZonedDateTime.of(2022, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC);
        double latitude = 45.0;
        double longitude = -70.0;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, 30.0);
        assertNotNull(result);
    }

}