package net.e175.klaus.solarpositioning;

import static org.junit.Assert.assertNotNull;

import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import net.e175.klaus.solarpositioning.Grena3;
import org.junit.Test;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class GeneratedCalculateSolarPositionTestDateLatLongDeltaTPressureTemperature {

    private static final double TEST_LATITUDE = 52.5200;
    private static final double TEST_LONGITUDE = 13.4050;
    private static final double TEST_DELTA_T = 68.8033;
    private static final double TEST_PRESSURE = 1013.25;
    private static final double TEST_TEMPERATURE = 15.0;

    @Test
    public void calculateSolarPositionTestDateLatLongDeltaTPressureTemperature() {
        ZonedDateTime dateTime = ZonedDateTime.of(2020, 12, 23, 12, 0, 0, 0, ZoneId.of("Europe/Berlin"));
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(dateTime, TEST_LATITUDE, TEST_LONGITUDE, TEST_DELTA_T, TEST_PRESSURE, TEST_TEMPERATURE);
        assertNotNull("Result should not be null", result);
    }

}