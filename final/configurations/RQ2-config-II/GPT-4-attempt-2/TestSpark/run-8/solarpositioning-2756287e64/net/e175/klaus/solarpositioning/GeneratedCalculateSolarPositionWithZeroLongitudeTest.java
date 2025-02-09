package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.ZonedDateTime;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSolarPositionWithZeroLongitudeTest {

    @Test
    public void calculateSolarPositionWithZeroLongitudeTest() {
        ZonedDateTime testDate = ZonedDateTime.now(ZoneOffset.UTC);
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(testDate, 52, 0, 30);
        assertNotNull(result);
    }

}