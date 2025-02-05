package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.ZonedDateTime;
import java.time.ZoneOffset;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void calculateSolarPositionValidDateTest() {
        ZonedDateTime date = ZonedDateTime.of(2022, 3, 15, 12, 0, 0, 0, ZoneOffset.UTC);
        AzimuthZenithAngle actual = Grena3.calculateSolarPosition(date, 37.7749, -122.4194, 69);
        assertNotNull(actual);
    }

    @Test
    public void calculateSolarPositionInvalidLatTest() {
        ZonedDateTime date = ZonedDateTime.of(2022, 3, 15, 12, 0, 0, 0, ZoneOffset.UTC);
        Grena3.calculateSolarPosition(date, 95.0, -122.4194, 69);
    }

    @Test
    public void calculateSolarPositionInvalidLongTest() {
        ZonedDateTime date = ZonedDateTime.of(2022, 3, 15, 12, 0, 0, 0, ZoneOffset.UTC);
        Grena3.calculateSolarPosition(date, 37.7749, -200.0, 69);
    }

    @Test
    public void calculateSolarPositionInvalidDeltaTTest() {
        ZonedDateTime date = ZonedDateTime.of(2022, 3, 15, 12, 0, 0, 0, ZoneOffset.UTC);
        Grena3.calculateSolarPosition(date, 37.7749, -122.4194, -50.0);
    }

    @Test
    public void calculateSolarPositionWithPressureTemperatureValidTest() {
        ZonedDateTime date = ZonedDateTime.of(2022, 3, 15, 12, 0, 0, 0, ZoneOffset.UTC);
        AzimuthZenithAngle actual = Grena3.calculateSolarPosition(date, 37.7749, -122.4194, 69, 1013, 15);
        assertNotNull(actual);
    }

    @Test
    public void calculateSolarPositionWithPressureTemperatureInvalidPressureTest() {
        ZonedDateTime date = ZonedDateTime.of(2022, 3, 15, 12, 0, 0, 0, ZoneOffset.UTC);
        Grena3.calculateSolarPosition(date, 37.7749, -122.4194, 69, -2000, 15);
    }

    @Test
    public void calculateSolarPositionWithPressureTemperatureInvalidTemperatureTest() {
        ZonedDateTime date = ZonedDateTime.of(2022, 3, 15, 12, 0, 0, 0, ZoneOffset.UTC);
        Grena3.calculateSolarPosition(date, 37.7749, -122.4194, 69, 1013, -300);
    }

}