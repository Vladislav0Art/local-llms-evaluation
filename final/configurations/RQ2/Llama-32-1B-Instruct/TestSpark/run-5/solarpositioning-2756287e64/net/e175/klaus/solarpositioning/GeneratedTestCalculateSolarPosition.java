package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

public class GeneratedTestCalculateSolarPosition {

    private static final ZoneId DEFAULT_ZONE = ZoneId.systemDefault();

    public static void calculateSolarPosition(ZonedDateTime date, double latitude, double longitude, double deltaT, int pressure) {
        ZonedDateTime time = date.withHour(12).withMinute(0);
        System.out.println("Calculating solar position for " + date + " with latitude = " + latitude + ", longitude = " + longitude + ", and pressure = " + pressure);
    }

    public static ZonedDateTime now() {
        return DEFAULT_ZONE.atTime(0, 0);
    }
}

public class GeneratedTest {

    @Test
    public void testCalculateSolarPosition() {
        Grena3.now().atTime(12, 30).inZone(DEFAULT_ZONE); // 1003
    }

}