package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedCalculateSolarPosition_BadLatitude {

    @Test
    public void calculateSolarPosition_BadLatitude() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = Double.NaN;
        double longitude = 0.0;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude);
        assertTrue(Double.isNaN(result.getAzimuth()));
    }

}