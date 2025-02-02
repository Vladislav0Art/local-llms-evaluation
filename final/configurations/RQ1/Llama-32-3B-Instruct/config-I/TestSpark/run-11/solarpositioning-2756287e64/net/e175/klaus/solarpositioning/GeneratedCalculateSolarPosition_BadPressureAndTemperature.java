package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedCalculateSolarPosition_BadPressureAndTemperature {

    @Test
    public void calculateSolarPosition_BadPressureAndTemperature() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 0.0;
        double longitude = 0.0;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, Double.NaN, Double.NaN);
        assertTrue(Double.isNaN(result.getAzimuth()));
    }

}