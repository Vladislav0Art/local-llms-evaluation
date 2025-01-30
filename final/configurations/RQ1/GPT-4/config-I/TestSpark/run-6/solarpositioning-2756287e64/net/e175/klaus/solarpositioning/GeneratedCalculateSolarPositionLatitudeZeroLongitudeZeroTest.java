package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedCalculateSolarPositionLatitudeZeroLongitudeZeroTest {

    private static final double DELTA = 0.01;

    @Test
    public void calculateSolarPositionLatitudeZeroLongitudeZeroTest() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        AzimuthZenithAngle solarPosition = Grena3.calculateSolarPosition(date, 0, 0, 0);
        assertNotNull(solarPosition);
    }

}