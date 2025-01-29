package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTest {

    @Test
    public void test_calculateSolarPosition_AzimuthZenithAngle() {
        ZonedDateTime date = ZonedDateTime.of(2022, 1, 1, 12, 0, 0);
        double latitude = 30.0;
        double longitude = -100.0;
        double deltaT = 15;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);

        assertEquals(23.0, result.getAzimuth(), 2);
    }

    @Test
    public void test_calculateSolarPosition_AzimuthZenithAngle_MismatchedDimensions() {
        ZonedDateTime date = ZonedDateTime.of(2022, 1, 1, 12, 0, 0);
        double latitude = 30.0;
        double longitude = -100.0;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude);

        assertEquals(null, result, 4.0);
    }

    @Test
    public void test_calculateSolarPosition_AzimuthZenithAngle_Pressure() {
        ZonedDateTime date = ZonedDateTime.of(2022, 1, 1, 12, 0, 0);
        double latitude = 30.0;
        double longitude = -100.0;

        Grena3.calculateSolarPosition(date, latitude, longitude, 10.0, 300.0);

        assertEquals(23.0, 45.0 * (1 + 10.0 / 300.0), 4);
    }

    @Test
    public void test_calculateSolarPosition_AzimuthZenithAngle_ExtremePressure() {
        ZonedDateTime date = ZonedDateTime.of(2022, 1, 1, 12, 0, 0);
        double latitude = -30.0;
        double longitude = -100.0;

        Grena3.calculateSolarPosition(date, latitude, longitude, 10.0, 300.0);

        assertEquals(23.0, 45.0 * (1 + 10.0 / 300.0), 4);
    }

    @Test
    public void test_calculateSolarPosition_AzimuthZenithAngle_ExtremeTemperature() {
        ZonedDateTime date = ZonedDateTime.of(2022, 1, 1, 12, 0, 0);
        double latitude = -30.0;
        double longitude = -100.0;

        Grena3.calculateSolarPosition(date, latitude, longitude, 300.0);

        assertEquals(23.0, 45.0 * (1 + 10.0 / 300.0), 4);
    }

}