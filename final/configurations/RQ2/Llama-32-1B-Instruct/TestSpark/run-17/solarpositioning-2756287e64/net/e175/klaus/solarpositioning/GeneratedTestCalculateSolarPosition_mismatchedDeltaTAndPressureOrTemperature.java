package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZoneOffset;
import java.util.UUID;

public class GeneratedTestCalculateSolarPosition_mismatchedDeltaTAndPressureOrTemperature {

    @Test
    public void testCalculateSolarPosition_mismatchedDeltaTAndPressureOrTemperature() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 52.52083333;
        double longitude = -13.40527778;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, 0.1, 101325);

        assertTrue(result.getR() > 0);
        assertTrue(result.getTheta() > 0);
    }

}