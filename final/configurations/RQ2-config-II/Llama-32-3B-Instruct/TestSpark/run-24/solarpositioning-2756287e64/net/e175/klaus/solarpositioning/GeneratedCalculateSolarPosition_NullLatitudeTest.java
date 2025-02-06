package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSolarPosition_NullLatitudeTest {

    @Test
    public void calculateSolarPosition_NullLatitudeTest() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = null;
        double longitude = 13.4050;
        try {
            Grena3.calculateSolarPosition(date, latitude, longitude);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
        }
    }

}