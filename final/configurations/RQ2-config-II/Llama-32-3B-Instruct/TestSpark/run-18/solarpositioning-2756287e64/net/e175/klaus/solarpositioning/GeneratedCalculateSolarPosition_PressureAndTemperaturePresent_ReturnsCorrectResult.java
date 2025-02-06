package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Random;

public class GeneratedCalculateSolarPosition_PressureAndTemperaturePresent_ReturnsCorrectResult {

    @Test
    public void calculateSolarPosition_PressureAndTemperaturePresent_ReturnsCorrectResult() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.ofHours(-5));
        double latitude = 48.8567; // Berlin, Germany
        double longitude = 14.3842; // Berlin, Germany
        double pressure = 1013;
        double temperature = 20;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, 10, pressure, temperature);
        assertEquals(AzimuthZenithAngle.TWENTY_FOUR_DEGREES, result.getAzimuth());
    }

}