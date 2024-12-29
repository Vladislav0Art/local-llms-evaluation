package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.ZonedDateTime;
import java.time.ZoneOffset;
import java.util.Random;

public class GeneratedTestCalculateSolarPositionMultiplePoints_DifferentDeltaTAndPressureTemperature {

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
    public void testCalculateSolarPositionMultiplePoints_DifferentDeltaTAndPressureTemperature() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.ofHours(random.nextInt(12)));
        double latitude1 = random.nextDouble();
        double longitude1 = random.nextDouble();

        Grena3.SolarPosition result1 = Grena3.calculateSolarPosition(date, latitude1, longitude1);
        assertEquals(latitude1 + 0.01, result1.getAzimuthZenithAngle().getLatitude());
    }

}