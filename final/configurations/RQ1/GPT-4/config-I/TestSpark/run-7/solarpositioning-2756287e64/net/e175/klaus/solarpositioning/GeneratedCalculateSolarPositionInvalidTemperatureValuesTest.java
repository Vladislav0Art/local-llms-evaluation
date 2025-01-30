package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import net.e175.klaus.solarpositioning.Grena3;
import org.junit.Test;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GeneratedCalculateSolarPositionInvalidTemperatureValuesTest {

    @Test
    public void calculateSolarPositionInvalidTemperatureValuesTest() {
        ZonedDateTime dateTime = ZonedDateTime.of(2075, 5, 5, 5, 5, 5, 5, ZoneId.of("UTC"));
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(dateTime, 51.5074, -0.1278, 31, 1000, -280);
        assertNotNull(result);
        assertTrue(result.getAzimuth() >= 0);
    }

}