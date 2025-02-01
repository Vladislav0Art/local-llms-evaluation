package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import org.junit.Test;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSolarPositionWithNegativeCoordinatesTest {

    @Test
    public void calculateSolarPositionWithNegativeCoordinatesTest() {
        ZonedDateTime utc = ZonedDateTime.of(2020, 6, 24, 13, 55, 0, 0, ZoneId.of("UTC"));
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(utc, -51.2, -4.4, 69.8);

        assertEquals(355.58089634385693, result.getAzimuth(), 0.00001);
        assertEquals(138.06515882012093, result.getZenithAngle(), 0.00001);
    }

}