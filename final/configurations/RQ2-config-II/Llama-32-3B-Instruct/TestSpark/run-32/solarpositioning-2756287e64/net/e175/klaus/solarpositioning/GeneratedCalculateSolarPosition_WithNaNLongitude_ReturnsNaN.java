package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import static java.lang.Math.*;

public class GeneratedCalculateSolarPosition_WithNaNLongitude_ReturnsNaN {

    @Test
    public void calculateSolarPosition_WithNaNLongitude_ReturnsNaN() {
        // given
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 37.7749;
        double longitude = Double.NaN;
        double deltaT = 0.1;

        // when
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);

        // then
        assertEquals(NAN, result.getAzimuth(), 1e-9);
    }

}