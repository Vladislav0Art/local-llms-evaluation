package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

import static org.junit.Assert.*;

public class GeneratedTest {

    private static final double DELTA = 0.00001;

    @Test
    public void calculateSolarPosition1WithMinimumValuesTest() {
        AzimuthZenithAngle aziZenAngle =
                Grena3.calculateSolarPosition(
                        ZonedDateTime.of(LocalDateTime.of(2010, 1, 1, 0, 0, 0), ZoneId.of("UTC")), -90, -180, -10);
        assertNotNull(aziZenAngle);
    }

    @Test
    public void calculateSolarPosition1WithMaximumValuesTest() {
        AzimuthZenithAngle aziZenAngle =
                Grena3.calculateSolarPosition(
                        ZonedDateTime.of(LocalDateTime.of(2110, 12, 31, 23, 59, 59), ZoneId.of("UTC")), 90, 180, 10);
        assertNotNull(aziZenAngle);
    }

    @Test
    public void calculateSolarPosition1LatitudeOverPositiveBoundTest() {
        try {
            Grena3.calculateSolarPosition(
                    ZonedDateTime.of(LocalDateTime.of(2010, 1, 1, 0, 0, 0), ZoneId.of("UTC")), 91, 0, 0);
            fail("Expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            assertEquals("Parameter latitude out of range.", e.getMessage());
        }
    }

    @Test
    public void calculateSolarPosition1LatitudeOverNegativeBoundTest() {
        try {
            Grena3.calculateSolarPosition(
                    ZonedDateTime.of(LocalDateTime.of(2010, 1, 1, 0, 0, 0), ZoneId.of("UTC")), -91, 0, 0);
            fail("Expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            assertEquals("Parameter latitude out of range.", e.getMessage());
        }
    }

    @Test
    public void calculateSolarPosition1LongitudeOverPositiveBoundTest() {
        try {
            Grena3.calculateSolarPosition(
                    ZonedDateTime.of(LocalDateTime.of(2010, 1, 1, 0, 0, 0), ZoneId.of("UTC")), 0, 181, 0);
            fail("Expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            assertEquals("Parameter longitude out of range.", e.getMessage());
        }
    }

    @Test
    public void calculateSolarPosition1LongitudeOverNegativeBoundTest() {
        try {
            Grena3.calculateSolarPosition(
                    ZonedDateTime.of(LocalDateTime.of(2010, 1, 1, 0, 0, 0), ZoneId.of("UTC")), 0, -181, 0);
            fail("Expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            assertEquals("Parameter longitude out of range.", e.getMessage());
        }
    }

    @Test
    public void calculateSolarPosition2WithoutRefractionCorrectionTest() {
        AzimuthZenithAngle aziZenAngle = Grena3.calculateSolarPosition(
                ZonedDateTime.of(LocalDateTime.of(2010, 1, 1, 0, 0, 0), ZoneId.of("UTC")), 0, 0, 0, 0, 0);
        assertNotNull(aziZenAngle);
    }

    @Test
    public void calculateSolarPosition2WithRefractionCorrectionTest() {
        AzimuthZenithAngle aziZenAngle = Grena3.calculateSolarPosition(
                ZonedDateTime.of(LocalDateTime.of(2010, 1, 1, 0, 0, 0), ZoneId.of("UTC")), 0, 0, 0, 1000, 20);
        assertNotNull(aziZenAngle);
    }

    @Test
    public void calculateSolarPosition2PressureOverPositiveBoundTest() {
        try {
            Grena3.calculateSolarPosition(
                    ZonedDateTime.of(LocalDateTime.of(2010, 1, 1, 0, 0, 0), ZoneId.of("UTC")), 0, 0, 0, 3001, 0);
            fail("Expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            assertEquals("Parameter pressure out of range.", e.getMessage());
        }
    }

    @Test
    public void calculateSolarPosition2TemperatureOverPositiveBoundTest() {
        try {
            Grena3.calculateSolarPosition(
                    ZonedDateTime.of(LocalDateTime.of(2010, 1, 1, 0, 0, 0), ZoneId.of("UTC")), 0, 0, 0, 0, 274);
            fail("Expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            assertEquals("Parameter temperature out of range.", e.getMessage());
        }
    }

    @Test
    public void calculateSolarPosition2TemperatureOverNegativeBoundTest() {
        try {
            Grena3.calculateSolarPosition(
                    ZonedDateTime.of(LocalDateTime.of(2010, 1, 1, 0, 0, 0), ZoneId.of("UTC")), 0, 0, 0, 0, -274);
            fail("Expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            assertEquals("Parameter temperature out of range.", e.getMessage());
        }
    }

}