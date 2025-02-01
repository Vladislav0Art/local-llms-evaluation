package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.Grena3;
import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import org.junit.Test;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    private static final double DELTA = 0.01;

    @Test
    public void calculateSolarPositionWithNaNPressureTemperatureTest() {
        ZonedDateTime date = ZonedDateTime.of(2021, 6, 21, 12, 0, 0, 0, ZoneId.of("UTC"));
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, 0, 0, 50, Double.NaN, Double.NaN);
        assertEquals(180.0, result.getAzimuth(), DELTA);
        assertEquals(67.0, result.getZenithAngle(), DELTA);
    }

    @Test
    public void calculateSolarPositionWithExtremePressureTemperatureTest() {
        ZonedDateTime date = ZonedDateTime.of(2021, 6, 21, 12, 0, 0, 0, ZoneId.of("UTC"));
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, 0, 0, 50, 3000, 273);
        assertEquals(180.0, result.getAzimuth(), DELTA);
        assertEquals(67.0, result.getZenithAngle(), DELTA);
    }

    @Test
    public void calculateSolarPositionWithNormalPressureTemperatureTest() {
        ZonedDateTime date = ZonedDateTime.of(2021, 6, 21, 12, 0, 0, 0, ZoneId.of("UTC"));
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, 0, 0, 50, 1000, 25);
        assertEquals(180.0, result.getAzimuth(), DELTA);
        assertEquals(66.8, result.getZenithAngle(), DELTA);
    }

    @Test
    public void calculateSolarPositionWithPositiveLatAndLongTest() {
        ZonedDateTime date = ZonedDateTime.of(2021, 6, 21, 12, 0, 0, 0, ZoneId.of("UTC"));
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, 50, 50, 50);
        assertEquals(209.4, result.getAzimuth(), DELTA);
        assertEquals(30.9, result.getZenithAngle(), DELTA);
    }

    @Test
    public void calculateSolarPositionWithNegativeLatAndLongTest() {
        ZonedDateTime date = ZonedDateTime.of(2021, 6, 21, 12, 0, 0, 0, ZoneId.of("UTC"));
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, -50, -50, 50);
        assertEquals(25.6, result.getAzimuth(), DELTA);
        assertEquals(88.2, result.getZenithAngle(), DELTA);
    }

}