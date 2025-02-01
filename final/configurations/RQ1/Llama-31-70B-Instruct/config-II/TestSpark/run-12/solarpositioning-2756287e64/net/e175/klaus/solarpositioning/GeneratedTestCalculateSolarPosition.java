package net.e175.klaus.solarpositioning;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import org.junit.Test;

public class GeneratedTestCalculateSolarPosition {

    @Test
    public void testCalculateSolarPosition() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 40.7128;
        double longitude = -74.0060;
        double deltaT = 60.0;

        AzimuthZenithAngle solarPosition = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);

        assertNotNull(solarPosition);
        assertEquals(solarPosition.getAzimuth(), 180.0, 0.01);
        assertEquals(solarPosition.getZenith(), 90.0, 0.01);
    }

}