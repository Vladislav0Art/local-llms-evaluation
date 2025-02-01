package net.e175.klaus.solarpositioning;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class GeneratedTest {

    private static final double DELTA = 1e-2;
    private static final ZonedDateTime TEST_DATE = ZonedDateTime.of(2021, 6, 29, 12, 30, 0, 0, ZoneId.of("UTC"));
    private static final double TEST_LATITUDE = 52.5200;
    private static final double TEST_LONGITUDE = 13.4050;
    private static final double TEST_DELTA_T = 67.97;
    private static final double TEST_PRESSURE = 1002.2;
    private static final double TEST_TEMPERATURE = 17;

    @Test
    public void calculateSolarPositionWithPressureTemperatureTest() {
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(TEST_DATE, TEST_LATITUDE, TEST_LONGITUDE, TEST_DELTA_T, TEST_PRESSURE, TEST_TEMPERATURE);

        assertEquals(211.927, result.getAzimuth(), DELTA);
        assertEquals(35.053, result.getZenithAngle(), DELTA);
    }

    @Test
    public void calculateSolarPositionWithoutPressureTemperatureTest() {
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(TEST_DATE, TEST_LATITUDE, TEST_LONGITUDE, TEST_DELTA_T);

        assertEquals(211.767, result.getAzimuth(), DELTA);
        assertEquals(35.836, result.getZenithAngle(), DELTA);
    }

    @Test
    public void calculateSolarPositionWithInvalidPressureTest() {
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(TEST_DATE, TEST_LATITUDE, TEST_LONGITUDE, TEST_DELTA_T, -10, TEST_TEMPERATURE);

        assertEquals(211.767, result.getAzimuth(), DELTA);
        assertEquals(35.836, result.getZenithAngle(), DELTA);
    }

    @Test
    public void calculateSolarPositionWithInvalidTemperatureTest() {
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(TEST_DATE, TEST_LATITUDE, TEST_LONGITUDE, TEST_DELTA_T, TEST_PRESSURE,
                -300);

        assertEquals(211.767, result.getAzimuth(), DELTA);
        assertEquals(35.836, result.getZenithAngle(), DELTA);
    }

}