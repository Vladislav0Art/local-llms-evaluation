package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedCalculateSolarPosition_BadLongitude {

    @Test
    public void calculateSolarPosition_BadLongitude() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 0.0;
        double longitude = Double.NaN;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude);
        assertTrue(Double.isNaN(result.getAzimuth()));
    }

}