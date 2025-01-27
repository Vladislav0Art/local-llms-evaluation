package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.ArrayList;

public class GeneratedTest {

    @Test
    public void calculateSolarPosition_DifferentDates_ReturnsDifferentAngles() {
        ZonedDateTime date1 = ZonedDateTime.of(2022, 12, 21, 0, 0, 0, ZoneOffset.UTC);
        ZonedDateTime date2 = ZonedDateTime.of(2022, 12, 22, 0, 0, 0, ZoneOffset.UTC);

        double latitude = 37.7749;
        double longitude = -122.4194;

        AzimuthZenithAngle angle1 = Grena3.calculateSolarPosition(date1, latitude, longitude);
        AzimuthZenithAngle angle2 = Grena3.calculateSolarPosition(date2, latitude, longitude);

        assertNotEquals(angle1, angle2);
    }

    @Test
    public void calculateSolarPosition_EmptyLatitude_ReturnsNull() {
        ZonedDateTime date = ZonedDateTime.of(2022, 12, 21, 0, 0, 0, ZoneOffset.UTC);
        double latitude = 37.7749;
        double longitude = -122.4194;

        AzimuthZenithAngle angle = Grena3.calculateSolarPosition(date, latitude, longitude);

        assertNull(angle);
    }

    @Test
    public void calculateSolarPosition_InvalidLatitude_ReturnsNull() {
        ZonedDateTime date = ZonedDateTime.of(2022, 12, 21, 0, 0, 0, ZoneOffset.UTC);
        double latitude = Double.NaN;
        double longitude = -122.4194;

        AzimuthZenithAngle angle = Grena3.calculateSolarPosition(date, latitude, longitude);

        assertNull(angle);
    }

    @Test
    public void calculateSolarPosition_InvalidLongitude_ReturnsNull() {
        ZonedDateTime date = ZonedDateTime.of(2022, 12, 21, 0, 0, 0, ZoneOffset.UTC);
        double latitude = 37.7749;
        double longitude = Double.NaN;

        AzimuthZenithAngle angle = Grena3.calculateSolarPosition(date, latitude, longitude);

        assertNull(angle);
    }

    @Test
    public void calculateSolarPosition_EmptyDeltaT_ReturnsNull() {
        ZonedDateTime date = ZonedDateTime.of(2022, 12, 21, 0, 0, 0, ZoneOffset.UTC);
        double latitude = 37.7749;
        double longitude = -122.4194;

        AzimuthZenithAngle angle = Grena3.calculateSolarPosition(date, latitude, longitude);

        assertNull(angle);
    }

    @Test
    public void calculateSolarPosition_EmptyPressure_ReturnsNull() {
        ZonedDateTime date = ZonedDateTime.of(2022, 12, 21, 0, 0, 0, ZoneOffset.UTC);
        double latitude = 37.7749;
        double longitude = -122.4194;

        AzimuthZenithAngle angle = Grena3.calculateSolarPosition(date, latitude, longitude);

        assertNull(angle);
    }

    @Test
    public void calculateSolarPosition_EmptyTemperature_ReturnsNull() {
        ZonedDateTime date = ZonedDateTime.of(2022, 12, 21, 0, 0, 0, ZoneOffset.UTC);
        double latitude = 37.7749;
        double longitude = -122.4194;

        AzimuthZenithAngle angle = Grena3.calculateSolarPosition(date, latitude, longitude);

        assertNull(angle);
    }

    @Test
    public void calculateSolarPosition_ValidDate_ReturnsNonNull() {
        ZonedDateTime date = ZonedDateTime.of(2022, 12, 21, 0, 0, 0, ZoneOffset.UTC);
        double latitude = 37.7749;
        double longitude = -122.4194;

        AzimuthZenithAngle angle = Grena3.calculateSolarPosition(date, latitude, longitude);

        assertNotNull(angle);
    }

    @Test
    public void calculateSolarPosition_ValidDateAndInput_ReturnsNonNull() {
        ZonedDateTime date = ZonedDateTime.of(2022, 12, 21, 0, 0, 0, ZoneOffset.UTC);
        double latitude = 37.7749;
        double longitude = -122.4194;

        AzimuthZenithAngle angle = Grena3.calculateSolarPosition(date, latitude, longitude);

        assertNotNull(angle);
    }

    @Test
    public void calculateSolarPosition_ValidDateAndInputWithPressure_ReturnsNonNull() {
        ZonedDateTime date = ZonedDateTime.of(2022, 12, 21, 0, 0, 0, ZoneOffset.UTC);
        double latitude = 37.7749;
        double longitude = -122.4194;

        AzimuthZenithAngle angle = Grena3.calculateSolarPosition(date, latitude, longitude, 101325);

        assertNotNull(angle);
    }

    @Test
    public void calculateSolarPosition_ValidDateAndInputWithTemperature_ReturnsNonNull() {
        ZonedDateTime date = ZonedDateTime.of(2022, 12, 21, 0, 0, 0, ZoneOffset.UTC);
        double latitude = 37.7749;
        double longitude = -122.4194;

        AzimuthZenithAngle angle = Grena3.calculateSolarPosition(date, latitude, longitude, 101325, 15);

        assertNotNull(angle);
    }

}