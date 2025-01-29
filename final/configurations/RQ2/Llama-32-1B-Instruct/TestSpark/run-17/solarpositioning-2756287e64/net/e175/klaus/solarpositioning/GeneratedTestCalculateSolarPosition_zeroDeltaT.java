package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZoneOffset;
import java.util.UUID;

public class GeneratedTestCalculateSolarPosition_zeroDeltaT {

    @Test
    public void testCalculateSolarPosition_zeroDeltaT() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 52.52083333;
        double longitude = -13.40527778;
        double pressure = 101325;
        double temperature = 288 K;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, 0, 273);

        assertTrue(result.getR() > 0);
        assertTrue(result.getTheta() > 0);
    }

}