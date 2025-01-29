package net.e175.klaus.solarpositioning;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class GeneratedTest {

    private static final ZoneId DEFAULT_ZONE = ZoneId.systemDefault();

    public static void calculateSolarPosition(ZonedDateTime date, double latitude, double longitude, double deltaT, int pressure) {
        ZonedDateTime time = new ZonedDateTime(date.toInstant().plusSeconds(deltaT * 1000)).atZone(DEFAULT_ZONE);
        System.out.println("Calculating solar position for " + date + " with latitude = " + latitude + ", longitude = " + longitude + ", and pressure = " + pressure);
    }

    public static ZonedDateTime now() {
        return DEFAULT_ZONE.atTime(0, 0);
    }
}

public class GeneratedTest {

}