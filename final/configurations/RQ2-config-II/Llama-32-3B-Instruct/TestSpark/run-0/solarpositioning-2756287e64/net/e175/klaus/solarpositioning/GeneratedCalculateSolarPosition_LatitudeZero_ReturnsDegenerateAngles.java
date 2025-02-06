package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import static java.lang.Math.*;

public class GeneratedCalculateSolarPosition_LatitudeZero_ReturnsDegenerateAngles {

    @Test
    public void calculateSolarPosition_LatitudeZero_ReturnsDegenerateAngles() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 0.0;
        double longitude = 0.0;

        AzimuthZenithAngle angle = Grena3.calculateSolarPosition(date, latitude, longitude, 0.0);

        assertTrue(isEqual(angle.getAzimuth(), Double.POSITIVE_INFINITY));
        assertTrue(isEqual(angle.getZenith(), Double.POSITIVE_INFINITY));
    }

}