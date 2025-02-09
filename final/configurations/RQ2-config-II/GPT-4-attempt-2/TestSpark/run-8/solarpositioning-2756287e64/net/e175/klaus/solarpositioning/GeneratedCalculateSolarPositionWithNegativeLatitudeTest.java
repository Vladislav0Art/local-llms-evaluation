package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.ZonedDateTime;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSolarPositionWithNegativeLatitudeTest {

    @Test
    public void calculateSolarPositionWithNegativeLatitudeTest() {
        ZonedDateTime testDate = ZonedDateTime.now(ZoneOffset.UTC);
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(testDate, -45, 30, 50);
        assertNotNull(result);
    }

}