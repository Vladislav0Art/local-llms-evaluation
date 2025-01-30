package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedCalculateSolarPositionEdgeDatesTest {

    private static final double DELTA = 0.01;

    @Test
    public void calculateSolarPositionEdgeDatesTest() {
        ZonedDateTime startDate = ZonedDateTime.of(2010, 1, 1, 12, 0, 0, 0, ZoneOffset.UTC);
        ZonedDateTime endDate = ZonedDateTime.of(2110, 12, 31, 12, 0, 0, 0, ZoneOffset.UTC);

        AzimuthZenithAngle startSolarPosition = Grena3.calculateSolarPosition(startDate, 50, 20, 68, 1010, 20);
        AzimuthZenithAngle endSolarPosition = Grena3.calculateSolarPosition(endDate, 50, 20, 68, 1010, 20);

        assertNotNull(startSolarPosition);
        assertNotNull(endSolarPosition);
    }

}