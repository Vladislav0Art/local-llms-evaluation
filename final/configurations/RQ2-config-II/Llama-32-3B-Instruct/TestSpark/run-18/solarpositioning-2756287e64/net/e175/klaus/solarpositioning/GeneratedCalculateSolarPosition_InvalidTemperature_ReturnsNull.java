package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Random;

public class GeneratedCalculateSolarPosition_InvalidTemperature_ReturnsNull {

    @Test
    public void calculateSolarPosition_InvalidTemperature_ReturnsNull() {
        ZonedDateTime date = null;
        double latitude = 48.8567; // Berlin, Germany
        double longitude = 14.3842; // Berlin, Germany
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, -1, Double.NaN, Double.NaN);
        assertTrue(result == null);
    }

}