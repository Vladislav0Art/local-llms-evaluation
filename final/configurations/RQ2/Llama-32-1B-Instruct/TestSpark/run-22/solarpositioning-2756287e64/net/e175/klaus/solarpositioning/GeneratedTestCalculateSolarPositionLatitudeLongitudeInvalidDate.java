package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

public class GeneratedTestCalculateSolarPositionLatitudeLongitudeInvalidDate {

    @Test
    public void testCalculateSolarPositionLatitudeLongitudeInvalidDate() {
        ZonedDateTime date = ZonedDateTime.of(2022, 6, 30, 12, 0);
        double latitude = 52.5200;
        double longitude = -13.4050;
        double deltaT = 36000; // 1 hour
        try {
            Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

}