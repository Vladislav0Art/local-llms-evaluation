package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void calculateSolarPosition_SingleInput_ReturnsCorrectResult() {
        double latitude = 37.7749;
        double longitude = -122.4194;
        ZonedDateTime date = ZonedDateTime.now();
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude);
        assertEquals(1.0, result.getAzimuth(), 0.01);
        assertEquals(2.0, result.getZenith(), 0.01);
    }

    @Test
    public void calculateSolarPosition_MultipleInput_ReturnsCorrectResult() {
        double latitude = 37.7749;
        double longitude = -122.4194;
        ZonedDateTime date = ZonedDateTime.now();
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, 1.0, 20.0, 15.0);
        assertEquals(1.5, result.getAzimuth(), 0.01);
        assertEquals(2.8, result.getZenith(), 0.01);
    }

    @Test
    public void calculateSolarPosition_NullDate_ThrowsNullPointerException() {
        double latitude = 37.7749;
        double longitude = -122.4194;
        assertThrows(NullPointerException.class, () -> Grena3.calculateSolarPosition(null, latitude, longitude));
    }

    @Test
    public void calculateSolarPosition_NegativeLatitude_ReturnsCorrectResult() {
        double latitude = -37.7749;
        double longitude = -122.4194;
        ZonedDateTime date = ZonedDateTime.now();
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude);
        assertEquals(0.0, result.getAzimuth(), 0.01);
        assertEquals(-2.0, result.getZenith(), 0.01);
    }

    @Test
    public void calculateSolarPosition_ZeroLongitude_ReturnsCorrectResult() {
        double latitude = 37.7749;
        double longitude = 0.0;
        ZonedDateTime date = ZonedDateTime.now();
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude);
        assertEquals(90.0, result.getAzimuth(), 0.01);
        assertEquals(-90.0, result.getZenith(), 0.01);
    }

    @Test
    public void calculateSolarPosition_NegativeLongitude_ReturnsCorrectResult() {
        double latitude = 37.7749;
        double longitude = -180.0;
        ZonedDateTime date = ZonedDateTime.now();
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude);
        assertEquals(-90.0, result.getAzimuth(), 0.01);
        assertEquals(90.0, result.getZenith(), 0.01);
    }

}