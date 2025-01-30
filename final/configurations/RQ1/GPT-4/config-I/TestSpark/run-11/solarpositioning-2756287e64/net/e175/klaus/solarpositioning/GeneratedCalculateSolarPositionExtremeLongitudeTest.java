package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import net.e175.klaus.solarpositioning.Grena3;
import org.junit.Test;

import java.time.ZonedDateTime;
import java.time.ZoneId;

import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSolarPositionExtremeLongitudeTest {

    // Use delta for comparing double values
    private static final double DELTA = 1e-10;

    @Test
    public void calculateSolarPositionExtremeLongitudeTest() {
        ZonedDateTime date = ZonedDateTime.of(2021, 12, 22, 12, 0, 0, 0, ZoneId.of("UTC"));
        double latitude = 0;
        double longitude = -180; // Prime meridian
        double deltaT = 69.182;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);

        // Azimuth and zenith values to be compared with the actual results
        double expectedAzimuth = 0;
        double expectedZenith = 0;

        assertEquals(expectedAzimuth, result.getAzimuth(), DELTA);
        assertEquals(expectedZenith, result.getZenithAngle(), DELTA);
    }

}