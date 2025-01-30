package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import net.e175.klaus.solarpositioning.Grena3;
import org.junit.Test;

import java.time.ZonedDateTime;
import java.time.ZoneId;

import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSolarPositionNominalConditionsTest {

    // Use delta for comparing double values
    private static final double DELTA = 1e-10;

    @Test
    public void calculateSolarPositionNominalConditionsTest() {
        ZonedDateTime date = ZonedDateTime.of(2021, 9, 3, 12, 0, 0, 0, ZoneId.of("UTC"));
        double latitude = 51.5074;
        double longitude = 0.1278;
        double deltaT = 69.182;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);

        // Azimuth and zenith values to be compared with the actual results
        double expectedAzimuth = 179.613;
        double expectedZenith = 36.94;

        assertEquals(expectedAzimuth, result.getAzimuth(), DELTA);
        assertEquals(expectedZenith, result.getZenithAngle(), DELTA);
    }

}