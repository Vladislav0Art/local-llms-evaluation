package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import java.time.ZonedDateTime;
import java.util.Random;

public class GeneratedTestCalculateSolarPosition {

    @Test
    public void testCalculateSolarPosition() {
        Random random = new Random();
        double latitude = 37.7749; // Los Angeles, CA
        double longitude = -122.4194; // San Francisco, CA

        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double deltaT = random.nextDouble();

        double resultLatitude = calculateSolarPosition(date, latitude, longitude, deltaT);
        double resultLongitude = calculateSolarPosition(date, latitude, longitude, deltaT + 1);

        assert Math.isClose(resultLatitude, 0.0001, 10);
        assert Math.isClose(resultLongitude, 0.0001, 10);
    }

    public double calculateSolarPosition(ZonedDateTime date, double latitude, double longitude, double deltaT) {
        return AzimuthZenithAngle.calculateSolarPosition(date, latitude, longitude, deltaT);
    }
}

class AzimuthZenithAngle {

    public static double calculateSolarPosition(ZonedDateTime date, double latitude, double longitude, double deltaT) {
        double radLatitude = Math.toRadians(latitude);
        double radLongitude = Math.toRadians(longitude);

        double angle = radLatitude + radLongitude;

        return 180 - Math.asin(Math.sin(radLatitude) * Math.cos(radLongitude) * Math.sqrt(1 - (Math.sin(angle / 2)) * * 2))
        ;
    }

}