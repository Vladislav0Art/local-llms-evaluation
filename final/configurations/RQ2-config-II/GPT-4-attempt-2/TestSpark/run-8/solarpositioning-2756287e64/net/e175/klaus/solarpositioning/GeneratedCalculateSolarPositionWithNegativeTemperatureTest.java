package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.ZonedDateTime;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSolarPositionWithNegativeTemperatureTest {

    @Test
    public void calculateSolarPositionWithNegativeTemperatureTest() {
        ZonedDateTime testDate = ZonedDateTime.now(ZoneOffset.UTC);
        Grena3.calculateSolarPosition(testDate, 52, 13, 70, 1000, -20);
    }

}