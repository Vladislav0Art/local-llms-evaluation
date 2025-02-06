package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSolarPosition_NullDateTest {

    @Test
    public void calculateSolarPosition_NullDateTest() {
        ZonedDateTime date = null;
        double latitude = 52.5200;
        double longitude = 13.4050;
        try {
            Grena3.calculateSolarPosition(date, latitude, longitude);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
        }
    }

}