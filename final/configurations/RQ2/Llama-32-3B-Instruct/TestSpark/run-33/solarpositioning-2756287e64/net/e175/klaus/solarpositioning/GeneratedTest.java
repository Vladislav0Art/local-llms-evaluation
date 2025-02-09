package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void calculateSolarPosition_NoDateTest() {
        assertThrows(IllegalArgumentException.class, () -> Grena3.calculateSolarPosition(null, 0, 0, 0));
    }

    @Test
    public void calculateSolarPosition_InValidDateTest() {
        ZonedDateTime date = ZonedDateTime.of(2000, 1, 1, 12, 0, 0, 0, ZoneOffset.UTC);
        assertThrows(IllegalArgumentException.class, () -> Grena3.calculateSolarPosition(date, 0, 0, 0));
    }

    @Test
    public void calculateSolarPosition_NoLatitudeTest() {
        ZonedDateTime date = ZonedDateTime.of(2000, 1, 1, 12, 0, 0, 0, ZoneOffset.UTC);
        assertThrows(IllegalArgumentException.class, () -> Grena3.calculateSolarPosition(date, 0, 0, 0));
    }

    @Test
    public void calculateSolarPosition_InValidLatitudeTest() {
        ZonedDateTime date = ZonedDateTime.of(2000, 1, 1, 12, 0, 0, 0, ZoneOffset.UTC);
        assertThrows(IllegalArgumentException.class, () -> Grena3.calculateSolarPosition(date, Double.POSITIVE_INFINITY, 0, 0));
    }

    @Test
    public void calculateSolarPosition_NoLongitudeTest() {
        ZonedDateTime date = ZonedDateTime.of(2000, 1, 1, 12, 0, 0, 0, ZoneOffset.UTC);
        assertThrows(IllegalArgumentException.class, () -> Grena3.calculateSolarPosition(date, 0, Double.NEGATIVE_INFINITY, 0));
    }

    @Test
    public void calculateSolarPosition_InValidLongitudeTest() {
        ZonedDateTime date = ZonedDateTime.of(2000, 1, 1, 12, 0, 0, 0, ZoneOffset.UTC);
        assertThrows(IllegalArgumentException.class, () -> Grena3.calculateSolarPosition(date, 0, Double.POSITIVE_INFINITY, 0));
    }

    @Test
    public void calculateSolarPosition_InValidDeltaTTest() {
        ZonedDateTime date = ZonedDateTime.of(2000, 1, 1, 12, 0, 0, 0, ZoneOffset.UTC);
        assertThrows(IllegalArgumentException.class, () -> Grena3.calculateSolarPosition(date, 0, 0, Double.POSITIVE_INFINITY));
    }

    @Test
    public void calculateSolarPosition_CalculateSolarPositionValidDateAndAnglesTest() {
        ZonedDateTime date = ZonedDateTime.of(2000, 1, 1, 12, 0, 0, 0, ZoneOffset.UTC);
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, 45.0, -10.0, 2.5);
        assertNotNull(result);
    }

    @Test
    public void calculateSolarPosition_CalculateSolarPositionWithPressureAndTemperatureValidDateAndAnglesTest() {
        ZonedDateTime date = ZonedDateTime.of(2000, 1, 1, 12, 0, 0, 0, ZoneOffset.UTC);
        double pressure = 1013.25;
        double temperature = 15.5;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, 45.0, -10.0, 2.5, pressure, temperature);
        assertNotNull(result);
    }

}