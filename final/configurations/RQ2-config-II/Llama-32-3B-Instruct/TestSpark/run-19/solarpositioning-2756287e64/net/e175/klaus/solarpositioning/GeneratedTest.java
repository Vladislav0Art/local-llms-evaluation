package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.concurrent.atomic.AtomicDouble;

import static java.lang.Math.*;

public class GeneratedTest {

    @Test
    public void calculateSolarPosition_SingleInput_DateAndCoordinatesTest() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 52.5200;
        double longitude = 13.4052;
        AzimuthZenithAngle angle = Grena3.calculateSolarPosition(date, latitude, longitude, 0.0);
        assertEquals(1.0, angle.getAzimuth(), 0.01);
        assertEquals(30.0, angle.getZenith(), 0.01);
    }

    @Test
    public void calculateSolarPosition_SingleInput_DateAndCoordinatesDeltaTTest() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 52.5200;
        double longitude = 13.4052;
        AzimuthZenithAngle angle = Grena3.calculateSolarPosition(date, latitude, longitude, 360.0);
        assertEquals(270.0, angle.getAzimuth(), 0.01);
        assertEquals(-30.0, angle.getZenith(), 0.01);
    }

    @Test
    public void calculateSolarPosition_MultipleInput_DateLatitudeLongitudeDeltaTPressureTemperatureTest() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 52.5200;
        double longitude = 13.4052;
        AzimuthZenithAngle angle = Grena3.calculateSolarPosition(date, latitude, longitude, 360.0, 1013.25, -20.0);
        assertEquals(270.0, angle.getAzimuth(), 0.01);
        assertEquals(-30.0, angle.getZenith(), 0.01);
    }

    @Test
    public void calculateSolarPosition_MultipleInput_DateLatitudeLongitudeDeltaTPressureTemperatureNoMatchTest() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 52.5200;
        double longitude = 13.4052;
        AzimuthZenithAngle angle1 = Grena3.calculateSolarPosition(date, latitude, longitude, 360.0, 1013.25, -20.0);
        AzimuthZenithAngle angle2 = Grena3.calculateSolarPosition(date, latitude, longitude, 360.0, 1013.26, -20.0);
        assertEquals(270.0, angle1.getAzimuth(), 0.01);
        assertEquals(-30.0, angle1.getZenith(), 0.01);
        assertEquals(271.0, angle2.getAzimuth(), 0.01);
        assertEquals(-31.0, angle2.getZenith(), 0.01);
    }

    @Test
    public void calculateSolarPosition_NullDateThrowsNullPointerException() {
        assertThrows(NullPointerException.class, () -> Grena3.calculateSolarPosition(null, 52.5200, 13.4052, 360.0));
    }

    @Test
    public void calculateSolarPosition_NegativeLatitudeThrowsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> Grena3.calculateSolarPosition(ZonedDateTime.now(ZoneOffset.UTC), -52.5200, 13.4052, 360.0));
    }

    @Test
    public void calculateSolarPosition_NegativeLongitudeThrowsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> Grena3.calculateSolarPosition(ZonedDateTime.now(ZoneOffset.UTC), 52.5200, -13.4052, 360.0));
    }

    @Test
    public void calculateSolarPosition_NegativeDeltaTThrowsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> Grena3.calculateSolarPosition(ZonedDateTime.now(ZoneOffset.UTC), 52.5200, 13.4052, -360.0));
    }

}