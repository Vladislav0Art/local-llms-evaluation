package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTest_calculateSolarPosition_AzimuthZenithAngle_ExtremeTemperature {

    @Test
    public void test_calculateSolarPosition_AzimuthZenithAngle_ExtremeTemperature() {
        ZonedDateTime date = ZonedDateTime.of(2022, 1, 1, 12, 0, 0);
        double latitude = -30.0;
        double longitude = -100.0;

        Grena3.calculateSolarPosition(date, latitude, longitude, 300.0);

        assertEquals(23.0, 45.0 * (1 + 10.0 / 300.0), 4);
    }

}