package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

public class GeneratedTestGetLocalDate {

    @Test
    public void testGetLocalDate() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 52.5200;
        double longitude = -13.4050;
        double deltaT = 36000; // 1 hour

        Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);

        System.out.println(new DateTime().year);
    }

}