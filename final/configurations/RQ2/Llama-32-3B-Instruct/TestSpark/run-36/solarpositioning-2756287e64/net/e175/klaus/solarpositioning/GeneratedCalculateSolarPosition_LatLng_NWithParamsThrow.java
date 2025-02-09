package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class GeneratedCalculateSolarPosition_LatLng_NWithParamsThrow {

    @Test
    public void calculateSolarPosition_LatLng_NWithParamsThrow() {
        ZonedDateTime date = ZonedDateTime.of(2022, 1, 1, 12, 0, 0, 0, ZoneOffset.UTC);
        double latitude = 52.5200;
        double longitude = 13.4050;
        try {
            Grena3.calculateSolarPosition(date, latitude, longitude, 10000);
            fail("Expected exception not thrown");
        } catch (NullPointerException e) {
        }
    }

}