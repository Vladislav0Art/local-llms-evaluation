package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSolarPosition_InValidDateTest {

    @Test
    public void calculateSolarPosition_InValidDateTest() {
        ZonedDateTime date = ZonedDateTime.of(2000, 1, 1, 12, 0, 0, 0, ZoneOffset.UTC);
        assertThrows(IllegalArgumentException.class, () -> Grena3.calculateSolarPosition(date, 0, 0, 0));
    }

}