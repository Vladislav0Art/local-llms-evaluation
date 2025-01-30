package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedCalculateSolarPositionInvalidTemperatureTest {

    private static final double DELTA = 0.01;

    @Test
    public void calculateSolarPositionInvalidTemperatureTest() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        AzimuthZenithAngle solarPosition = Grena3.calculateSolarPosition(date, 50, 20, 68, 1010, -300);
        assertNotNull(solarPosition);
    }

}