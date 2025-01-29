package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void testCalculateSolarPositionNoPressure() {
        when(pressure()).thenReturn(0);
        ZonedDateTime date = new ZonedDateTime(2022, 1, 1, 12, 0, 0, ZoneOffset.UTC);
        double latitude = 37.7749;
        double longitude = -122.4194;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, 10);

        assertEquals(25.032, result.getAzimuth(), 5);
    }

    @Test
    public void testCalculateSolarPositionWithTemperature() {
        when(pressure()).thenReturn(0);
        when(temperature()).thenReturn(288.15);
        ZonedDateTime date = new ZonedDateTime(2022, 1, 1, 12, 0, 0, ZoneOffset.UTC);
        double latitude = 37.7749;
        double longitude = -122.4194;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, 10, 288.15);

        assertEquals(25.032, result.getAzimuth(), 5);
    }

    @Test
    public void testCalculateSolarPositionNoLatitude() {
        when(latitude()).thenReturn(null);
        ZonedDateTime date = new ZonedDateTime(2022, 1, 1, 12, 0, 0, ZoneOffset.UTC);
        double longitude = -122.4194;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, null, longitude, 10);

        assertEquals(-122.4194, result.getLongitude(), 5);
    }

    @Test
    public void testCalculateSolarPositionNoLongitude() {
        when(longitude()).thenReturn(null);
        ZonedDateTime date = new ZonedDateTime(2022, 1, 1, 12, 0, 0, ZoneOffset.UTC);
        double latitude = 37.7749;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, null, 10);

        assertEquals(37.7749, result.getLatitude(), 5);
    }

    @Test
    public void testCalculateSolarPositionWithDeltaT() {
        when(deltaT()).thenReturn(10);
        ZonedDateTime date = new ZonedDateTime(2022, 1, 1, 12, 0, 0, ZoneOffset.UTC);
        double latitude = 37.7749;
        double longitude = -122.4194;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, 10);

        assertEquals(25.032, result.getAzimuth(), 5);
    }

    @Test
    public void testCalculateSolarPositionNoDeltaT() {
        when(deltaT()).thenReturn(null);
        ZonedDateTime date = new ZonedDateTime(2022, 1, 1, 12, 0, 0, ZoneOffset.UTC);
        double latitude = 37.7749;
        double longitude = -122.4194;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, 10);

        assertEquals(25.032, result.getAzimuth(), 5);
    }

}