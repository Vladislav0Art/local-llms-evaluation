package net.e175.klaus.solarpositioning;

import java.time.ZoneOffset;
import java.util.Random;

import org.junit.jupiter.api.Test;

public class GeneratedTestCalculateSolarPosition_RandomLatitudeLongitude_PressureTemperature {

    private final Random random = new Random();

    public AzimuthZenithAngle calculateSolarPosition(ZonedDateTime date, double latitude, double longitude, double deltaT) {
        return Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
    }

    @Test
    public void testCalculateSolarPosition_RandomLatitudeLongitude_PressureTemperature() {
        ZonedDateTime dateTime = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = random.nextDouble() * 90;
        double longitude = random.nextDouble() * 180 - 90;

        AzimuthZenithAngle result = calculateSolarPosition(dateTime, latitude, longitude, 0.1, 10000, 20);

        assertEquals(latitude, result.getLatitude());
        assertEquals(longitude, result.getLongitude());
    }

}