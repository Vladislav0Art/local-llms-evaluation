package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.OptionalDouble;
import java.util.Map;

public class GeneratedCalculateSolarPosition_DeltaTZero_PressureAndTemperatureNoChangeTest {

    @Test
    public void calculateSolarPosition_DeltaTZero_PressureAndTemperatureNoChangeTest() {
        ZonedDateTime date = ZonedDateTime.of(2022, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC);
        double latitude = 40.7128;
        double longitude = -74.0060;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, 0, 10, 20);
        assertNotNull(result);
    }

}