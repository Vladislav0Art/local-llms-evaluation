package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedCalculateSolarPositionValidInputTest {

    @Test
    public void calculateSolarPositionValidInputTest() {
        ZonedDateTime date = ZonedDateTime.of(2020, 7, 20, 12, 0, 0, 0, ZoneId.of("GMT"));
        double latitude = 40.7128;
        double longitude = 74.0060;
        double deltaT = 69.0;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);

        assertNotNull(result);
        assertEquals(275.41, result.getAzimuth(), 0.01);
        assertEquals(35.89, result.getZenithAngle(), 0.01);
    }

}