package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import net.e175.klaus.solarpositioning.Grena3;
import org.junit.Test;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GeneratedCalculateSolarPositionAllParametersTest {

    @Test
    public void calculateSolarPositionAllParametersTest() {
        ZonedDateTime dateTime = ZonedDateTime.of(2092, 12, 12, 12, 12, 12, 12, ZoneId.of("UTC"));
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(dateTime, 34.0522, 118.2437, 31, 1000, 12);
        assertNotNull(result);
        assertTrue(result.getAzimuth() >= 0);
        assertTrue(result.getZenithAngle() >= 0);
    }

}