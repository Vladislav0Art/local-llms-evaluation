package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import static java.lang.Math.*;

public class GeneratedCalculateSolarPosition_LatitudeNegative_ReturnsAnglesWithCorrectSign {

    @Test
    public void calculateSolarPosition_LatitudeNegative_ReturnsAnglesWithCorrectSign() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = -45.0;
        double longitude = 0.0;

        AzimuthZenithAngle angle = Grena3.calculateSolarPosition(date, latitude, longitude, 0.0);

        assertTrue(angle.getAzimuth() < 0.0);
    }

}