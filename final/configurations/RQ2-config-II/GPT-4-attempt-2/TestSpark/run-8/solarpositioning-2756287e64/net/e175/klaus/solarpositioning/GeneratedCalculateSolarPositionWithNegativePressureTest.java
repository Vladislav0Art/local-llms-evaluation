package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.ZonedDateTime;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSolarPositionWithNegativePressureTest {

    @Test
    public void calculateSolarPositionWithNegativePressureTest() {
        ZonedDateTime testDate = ZonedDateTime.now(ZoneOffset.UTC);
        Grena3.calculateSolarPosition(testDate, 52, 13, 70, -900, 20);
    }

}