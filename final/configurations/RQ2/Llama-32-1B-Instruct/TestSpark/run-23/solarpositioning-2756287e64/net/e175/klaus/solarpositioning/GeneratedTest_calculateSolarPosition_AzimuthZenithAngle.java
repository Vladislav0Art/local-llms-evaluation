package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTest_calculateSolarPosition_AzimuthZenithAngle {

    @Test
    public void test_calculateSolarPosition_AzimuthZenithAngle() {
        ZonedDateTime date = ZonedDateTime.of(2022, 1, 1, 12, 0, 0);
        double latitude = 30.0;
        double longitude = -100.0;
        double deltaT = 15;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);

        assertEquals(23.0, result.getAzimuth(), 2);
    }

}