package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSolarPosition_InValidLongitudeTest {

    @Test
    public void calculateSolarPosition_InValidLongitudeTest() {
        ZonedDateTime date = ZonedDateTime.of(2000, 1, 1, 12, 0, 0, 0, ZoneOffset.UTC);
        assertThrows(IllegalArgumentException.class, () -> Grena3.calculateSolarPosition(date, 0, Double.POSITIVE_INFINITY, 0));
    }

}