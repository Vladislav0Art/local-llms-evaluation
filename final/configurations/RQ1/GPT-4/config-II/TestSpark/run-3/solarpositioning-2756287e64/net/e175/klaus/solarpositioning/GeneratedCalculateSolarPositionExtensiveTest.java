package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import org.junit.Test;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSolarPositionExtensiveTest {

    @Test
    public void calculateSolarPositionExtensiveTest() {
        ZonedDateTime utc = ZonedDateTime.of(2050, 12, 31, 23, 59, 59, 0, ZoneId.of("UTC"));
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(utc, 90.0, 180.0, 1000.0);

        assertEquals(114.96711883242783, result.getAzimuth(), 0.00001);
        assertEquals(110.94410007065352, result.getZenithAngle(), 0.00001);
    }

}