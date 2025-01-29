package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

public class GeneratedTestCalculateSolarPositionLatitudeLongitudeZero {

    @Test
    public void testCalculateSolarPositionLatitudeLongitudeZero() {
        ZonedDateTime date = ZonedDateTime.of(2022, 12, 31, 0, 0);
        double latitude = 52.5200;
        double longitude = -13.4050;
        double deltaT = 36000; // 1 hour
        Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
    }

}