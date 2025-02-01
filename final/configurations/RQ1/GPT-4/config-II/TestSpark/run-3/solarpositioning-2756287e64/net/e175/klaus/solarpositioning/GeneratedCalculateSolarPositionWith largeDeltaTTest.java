package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import org.junit.Test;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSolarPositionWith largeDeltaTTest {

    @Test
    public void calculateSolarPositionWith

    largeDeltaTTest() {
        ZonedDateTime utc = ZonedDateTime.of(2020, 6, 24, 13, 55, 0, 0, ZoneId.of("UTC"));
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(utc, 51.2, 4.4, 1000000.5);

        assertEquals(219.86670612660706, result.getAzimuth(), 0.00001);
        assertEquals(41.87753263754391, result.getZenithAngle(), 0.00001);
    }

}