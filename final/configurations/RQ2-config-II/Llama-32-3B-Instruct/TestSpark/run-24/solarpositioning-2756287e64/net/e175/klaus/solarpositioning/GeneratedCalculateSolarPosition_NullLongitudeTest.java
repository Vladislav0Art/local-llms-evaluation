package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSolarPosition_NullLongitudeTest {

    @Test
    public void calculateSolarPosition_NullLongitudeTest() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 52.5200;
        double longitude = null;
        try {
            Grena3.calculateSolarPosition(date, latitude, longitude);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
        }
    }

}