package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedCalculateSolarPosition_NoDeltaT {

    @Test
    public void calculateSolarPosition_NoDeltaT() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 0.0;
        double longitude = 0.0;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude);
        assertTrue(result.getAzimuth() > -360.0 && result.getAzimuth() < 360.0);
    }

}