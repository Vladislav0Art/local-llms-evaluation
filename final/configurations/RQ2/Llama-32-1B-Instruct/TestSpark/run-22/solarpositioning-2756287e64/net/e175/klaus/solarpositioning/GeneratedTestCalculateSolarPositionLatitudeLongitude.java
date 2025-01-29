package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

public class GeneratedTestCalculateSolarPositionLatitudeLongitude {

    @Test
    public void testCalculateSolarPositionLatitudeLongitude() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 52.5200;
        double longitude = -13.4050;
        double deltaT = 36000; // 1 hour
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);

        System.out.println(result.toLocalDate());
    }

    public class DateTime {
        int year;

        public DateTime(int y) {
            this.year = y;
        }
    }

}