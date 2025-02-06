package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Random;

public class GeneratedCalculateSolarPosition_ValidInputs_ReturnsValidAzimuthZenithAngle {

    @Test
    public void calculateSolarPosition_ValidInputs_ReturnsValidAzimuthZenithAngle() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.ofHours(-5));
        double latitude = 48.8567; // Berlin, Germany
        double longitude = 14.3842; // Berlin, Germany
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, 0);
        assertEquals(AzimuthZenithAngle.ZERO_DEGREES, result.getAzimuth());
        assertEquals(ZenithAngle.NINE_HUNDRED_THIRTY_DEGREES, result.getZenith());
    }

}