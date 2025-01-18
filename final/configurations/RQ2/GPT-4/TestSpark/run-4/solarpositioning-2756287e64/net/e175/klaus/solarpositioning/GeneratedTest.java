package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.Grena3;
import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import org.junit.Test;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void calculateSolarPositionWithoutPressureTemperatureTest() {
        ZonedDateTime date = ZonedDateTime.of(2020, 1, 1, 12, 0, 0, 0, ZoneOffset.UTC);
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, 50, 20, 69);
        assertNotNull(result);
    }

    @Test
    public void calculateSolarPositionWithNegativeLatitudeTest() {
        ZonedDateTime date = ZonedDateTime.of(2020, 1, 1, 12, 0, 0, 0, ZoneOffset.UTC);
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, -50, 20, 69);
        assertNotNull(result);
    }

    @Test
    public void calculateSolarPositionWithZeroLongitudeTest() {
        ZonedDateTime date = ZonedDateTime.of(2020, 1, 1, 12, 0, 0, 0, ZoneOffset.UTC);
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, 50, 0, 69);
        assertNotNull(result);
    }

    @Test
    public void calculateSolarPositionWithZeroDeltaTTest() {
        ZonedDateTime date = ZonedDateTime.of(2020, 1, 1, 12, 0, 0, 0, ZoneOffset.UTC);
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, 50, 20, 0);
        assertNotNull(result);
    }

    @Test
    public void calculateSolarPositionWithPressureTemperatureTest() {
        ZonedDateTime date = ZonedDateTime.of(2020, 1, 1, 12, 0, 0, 0, ZoneOffset.UTC);
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, 50, 20, 69, 1000, 20);
        assertNotNull(result);
    }

    @Test
    public void calculateSolarPositionWithNegativePressureTest() {
        ZonedDateTime date = ZonedDateTime.of(2020, 1, 1, 12, 0, 0, 0, ZoneOffset.UTC);
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, 50, 20, 69, -1000, 20);
        assertNotNull(result);
    }

    @Test
    public void calculateSolarPositionWithZeroTemperatureTest() {
        ZonedDateTime date = ZonedDateTime.of(2020, 1, 1, 12, 0, 0, 0, ZoneOffset.UTC);
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, 50, 20, 69, 1000, 0);
        assertNotNull(result);
    }

}