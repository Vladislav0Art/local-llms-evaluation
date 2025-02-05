package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.ZonedDateTime;
import java.time.ZoneOffset;

import static org.junit.Assert.*;

public class GeneratedCalculateSolarPositionWithPressureTemperatureValidTest {

    @Test
    public void calculateSolarPositionWithPressureTemperatureValidTest() {
        ZonedDateTime date = ZonedDateTime.of(2022, 3, 15, 12, 0, 0, 0, ZoneOffset.UTC);
        AzimuthZenithAngle actual = Grena3.calculateSolarPosition(date, 37.7749, -122.4194, 69, 1013, 15);
        assertNotNull(actual);
    }

}