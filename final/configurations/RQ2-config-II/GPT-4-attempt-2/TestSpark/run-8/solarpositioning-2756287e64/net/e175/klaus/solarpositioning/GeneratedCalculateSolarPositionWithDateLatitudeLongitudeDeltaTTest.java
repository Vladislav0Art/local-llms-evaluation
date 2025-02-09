package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.ZonedDateTime;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSolarPositionWithDateLatitudeLongitudeDeltaTTest {

    @Test
    public void calculateSolarPositionWithDateLatitudeLongitudeDeltaTTest() {
        ZonedDateTime testDate = ZonedDateTime.now(ZoneOffset.UTC);
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(testDate, 42, 20, 60);
        assertNotNull(result);
    }

}