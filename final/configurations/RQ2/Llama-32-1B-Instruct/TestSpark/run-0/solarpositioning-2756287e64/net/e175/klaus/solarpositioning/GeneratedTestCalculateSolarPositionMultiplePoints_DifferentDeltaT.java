package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.ZonedDateTime;
import java.time.ZoneOffset;
import java.util.Random;

public class GeneratedTestCalculateSolarPositionMultiplePoints_DifferentDeltaT {

    private final Random random = new Random();
    private final String[] methodNames = {
            "calculateSolarPosition",
            "calculateSolarPositionDeltaT",
            "calculateSolarPositionPressureTemperature"
    };

    @BeforeEach
    public void setup() {
    }

    @Test
    public void testCalculateSolarPositionMultiplePoints_DifferentDeltaT() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.ofHours(random.nextInt(12)));
        double latitude = random.nextDouble();
        double longitude = random.nextDouble();
        double pressure = random.nextDouble();
        double temperature = random.nextDouble();

        Grena3.SolarPosition result1 = Grena3.calculateSolarPosition(date, latitude, longitude, 0.01);
        assertEquals(latitude, result1.getAzimuthZenithAngle().getLatitude());
        assertEquals(longitude, result1.getAzimuthZenithAngle().getLongitude());
        assertEquals(pressure, result1.getPressure(), 0.001);
        assertEquals(temperature, result1.getTemperature(), 0.001);

        Grena3.SolarPosition result2 = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
        assertEquals(latitude + 0.01, result2.getAzimuthZenithAngle().getLatitude());
        assertEquals(longitude + 0.01, result2.getAzimuthZenithAngle().getLongitude());
    }

}