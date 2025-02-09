package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class GeneratedCalculateSolarPosition_LatLng_TNoParamsReturnNaN {

    @Test
    public void calculateSolarPosition_LatLng_TNoParamsReturnNaN() {
        ZonedDateTime date = ZonedDateTime.of(2022, 1, 1, 12, 0, 0, 0, ZoneOffset.UTC);
        double latitude = 52.5200;
        double longitude = 13.4050;
        AzimuthZenithAngle actual = Grena3.calculateSolarPosition(date, latitude, longitude, null);
        assertEquals(AzimuthZenithAngle.NaN, actual);
    }

}