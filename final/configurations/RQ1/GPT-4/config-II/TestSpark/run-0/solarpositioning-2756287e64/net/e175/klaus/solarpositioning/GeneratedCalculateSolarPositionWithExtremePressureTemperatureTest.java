package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.Grena3;
import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import org.junit.Test;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSolarPositionWithExtremePressureTemperatureTest {

    private static final double DELTA = 0.01;

    @Test
    public void calculateSolarPositionWithExtremePressureTemperatureTest() {
        ZonedDateTime date = ZonedDateTime.of(2021, 6, 21, 12, 0, 0, 0, ZoneId.of("UTC"));
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, 0, 0, 50, 3000, 273);
        assertEquals(180.0, result.getAzimuth(), DELTA);
        assertEquals(67.0, result.getZenithAngle(), DELTA);
    }

}