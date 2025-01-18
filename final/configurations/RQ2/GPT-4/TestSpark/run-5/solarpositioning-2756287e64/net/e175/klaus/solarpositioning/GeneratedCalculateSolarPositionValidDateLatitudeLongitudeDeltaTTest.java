package net.e175.klaus.solarpositioning;

import org.junit.Test;
import net.e175.klaus.solarpositioning.Grena3;
import net.e175.klaus.solarpositioning.AzimuthZenithAngle;

import java.time.ZonedDateTime;

import static org.junit.Assert.*;

public class GeneratedCalculateSolarPositionValidDateLatitudeLongitudeDeltaTTest {

    @Test
    public void calculateSolarPositionValidDateLatitudeLongitudeDeltaTTest() {
        final ZonedDateTime date = ZonedDateTime.now();
        final double latitude = 64.1265; // Reykjavik, Iceland
        final double longitude = -21.8174;
        final double deltaT = 69.0;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);

        assertNotNull(result);
        assertTrue(result.getZenithAngle() >= 0);
        assertTrue(result.getAzimuth() >= 0);
    }

}