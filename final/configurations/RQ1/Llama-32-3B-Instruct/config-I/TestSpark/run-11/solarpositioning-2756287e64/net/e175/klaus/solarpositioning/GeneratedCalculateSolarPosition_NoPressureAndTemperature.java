package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedCalculateSolarPosition_NoPressureAndTemperature {

    @Test
    public void calculateSolarPosition_NoPressureAndTemperature() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 0.0;
        double longitude = 0.0;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, -1.0, -273.0);
        assertTrue(result.getAzimuth() > -360.0 && result.getAzimuth() < 360.0);
    }

}