package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZoneOffset;
import java.util.UUID;

public class GeneratedTestCalculateSolarPosition_mismatchedPressureAndTemperature {

    @Test
    public void testCalculateSolarPosition_mismatchedPressureAndTemperature() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 52.52083333;
        double longitude = -13.40527778;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, 101325, 288);

        assertTrue(result.getR() > 0);
        assertTrue(result.getTheta() > 0);
    }

}