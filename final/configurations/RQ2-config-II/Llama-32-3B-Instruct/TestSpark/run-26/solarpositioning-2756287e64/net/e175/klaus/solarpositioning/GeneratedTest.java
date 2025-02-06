package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import static java.lang.Math.*;

public class GeneratedTest {

    @Test
    public void calculateSolarPosition_DefaultValues_ReturnsAzimuthZenithAngle() {
        ZonedDateTime date = ZonedDateTime.of(2022, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC);
        double latitude = 45.0;
        double longitude = -70.0;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, 0.0);
        assertNotNull(result);
    }

    @Test
    public void calculateSolarPosition_DifferentValues_ReturnsAzimuthZenithAngle() {
        ZonedDateTime date = ZonedDateTime.of(2022, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC);
        double latitude = 45.0;
        double longitude = -70.0;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, 30.0);
        assertNotNull(result);
    }

    @Test
    public void calculateSolarPosition_MissingParameters_ThrowsIllegalArgumentException() {
        ZonedDateTime date = ZonedDateTime.of(2022, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC);
        double latitude = 45.0;
        double longitude = -70.0;
        assertThrows(IllegalArgumentException.class, () -> Grena3.calculateSolarPosition(date, latitude, longitude));
    }

    @Test
    public void calculateSolarPosition_TemperatureAndPressure_ReturnsAzimuthZenithAngle() {
        ZonedDateTime date = ZonedDateTime.of(2022, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC);
        double latitude = 45.0;
        double longitude = -70.0;
        double pressure = 1013.25;
        double temperature = 20.0;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, 30.0, pressure, temperature);
        assertNotNull(result);
    }

    @Test
    public void calculateSolarPosition_TemperatureAndPressure_MissingValues_ThrowsIllegalArgumentException() {
        ZonedDateTime date = ZonedDateTime.of(2022, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC);
        double latitude = 45.0;
        double longitude = -70.0;
        assertThrows(IllegalArgumentException.class, () -> Grena3.calculateSolarPosition(date, latitude, longitude, 30.0, pressure = 1013.25));
    }

}