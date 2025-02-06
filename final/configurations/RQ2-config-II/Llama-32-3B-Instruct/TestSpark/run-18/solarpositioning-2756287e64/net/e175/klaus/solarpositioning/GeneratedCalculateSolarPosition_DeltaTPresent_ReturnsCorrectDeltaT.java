package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Random;

public class GeneratedCalculateSolarPosition_DeltaTPresent_ReturnsCorrectDeltaT {

    @Test
    public void calculateSolarPosition_DeltaTPresent_ReturnsCorrectDeltaT() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.ofHours(-5));
        double latitude = 48.8567; // Berlin, Germany
        double longitude = 14.3842; // Berlin, Germany
        double deltaT = 10;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
        assertTrue(result.getDeltaT() == deltaT);
    }

}