package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.OptionalDouble;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void calculateSolarPosition_DeltaTZero_NoChangeTest() {
        ZonedDateTime date = ZonedDateTime.of(2022, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC);
        double latitude = 40.7128;
        double longitude = -74.0060;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, 0);
        assertNotNull(result);
    }

    @Test
    public void calculateSolarPosition_DeltaTPositive_NoChangeTest() {
        ZonedDateTime date = ZonedDateTime.of(2022, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC);
        double latitude = 40.7128;
        double longitude = -74.0060;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, 3600);
        assertNotNull(result);
    }

    @Test
    public void calculateSolarPosition_DeltaTNegative_NoChangeTest() {
        ZonedDateTime date = ZonedDateTime.of(2022, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC);
        double latitude = 40.7128;
        double longitude = -74.0060;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, -3600);
        assertNotNull(result);
    }

    @Test
    public void calculateSolarPosition_DeltaTZero_PressureAndTemperatureNoChangeTest() {
        ZonedDateTime date = ZonedDateTime.of(2022, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC);
        double latitude = 40.7128;
        double longitude = -74.0060;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, 0, 10, 20);
        assertNotNull(result);
    }

    @Test
    public void calculateSolarPosition_DeltaTZero_PressureAndTemperatureNonZeroValuesTest() {
        ZonedDateTime date = ZonedDateTime.of(2022, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC);
        double latitude = 40.7128;
        double longitude = -74.0060;
        OptionalDouble pressure = OptionalDouble.of(1013.25);
        OptionalDouble temperature = OptionalDouble.of(15.5);
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, 0, pressure.get(), temperature.get());
        assertNotNull(result);
    }

    @Test
    public void calculateSolarPosition_DeltaTPositive_PressureAndTemperatureNonZeroValuesTest() {
        ZonedDateTime date = ZonedDateTime.of(2022, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC);
        double latitude = 40.7128;
        double longitude = -74.0060;
        OptionalDouble pressure = OptionalDouble.of(1013.25);
        OptionalDouble temperature = OptionalDouble.of(15.5);
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, 3600, pressure.get(), temperature.get());
        assertNotNull(result);
    }

    @Test
    public void calculateSolarPosition_DeltaTNegative_PressureAndTemperatureNonZeroValuesTest() {
        ZonedDateTime date = ZonedDateTime.of(2022, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC);
        double latitude = 40.7128;
        double longitude = -74.0060;
        OptionalDouble pressure = OptionalDouble.of(1013.25);
        OptionalDouble temperature = OptionalDouble.of(15.5);
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, -3600, pressure.get(), temperature.get());
        assertNotNull(result);
    }

}