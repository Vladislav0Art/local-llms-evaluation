package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedCalculateSolarPositionNullDateTest {

    @Test
    public void calculateSolarPositionNullDateTest() {
        Grena3.calculateSolarPosition(null, 40.7128, 74.0060, 69.0);
    }

}