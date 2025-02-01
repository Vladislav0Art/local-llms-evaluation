package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import org.junit.Test;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSolarPositionWithPressureTemperatureTest {

    @Test
    public void calculateSolarPositionWithPressureTemperatureTest() {
        ZonedDateTime utc = ZonedDateTime.of(2020, 6, 24, 13, 55, 0, 0, ZoneId.of("UTC"));
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(utc, 51.2, 4.4, 69.8, 1013.25, 15.0);

        assertEquals(179.8934896603313, result.getAzimuth(), 0.00001);
        assertEquals(41.85630393472177, result.getZenithAngle(), 0.00001);
    }

}