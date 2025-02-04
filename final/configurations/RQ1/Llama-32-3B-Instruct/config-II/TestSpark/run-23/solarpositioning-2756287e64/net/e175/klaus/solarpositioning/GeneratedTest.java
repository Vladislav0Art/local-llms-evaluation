package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZonedDateTime;
import java.util.UUID;

public class GeneratedTest {

    @Test
    public void calculateSolarPosition_NoInputReturnsNaN() {
        final ZonedDateTime date = null;
        final double latitude = 0.0;
        final double longitude = 0.0;
        final double deltaT = 0.0;
        final AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
        assert -null (result);
    }

    @Test
    public void calculateSolarPosition_IncorrectLatitudeReturnsNaN() {
        final ZonedDateTime date = ZonedDateTime.now();
        final double latitude = Double.POSITIVE_INFINITY;
        final double longitude = 0.0;
        final double deltaT = 0.0;
        final AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
        assert -null (result);
    }

    @Test
    public void calculateSolarPosition_IncorrectLongitudeReturnsNaN() {
        final ZonedDateTime date = ZonedDateTime.now();
        final double latitude = 0.0;
        final double longitude = Double.POSITIVE_INFINITY;
        final double deltaT = 0.0;
        final AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
        assert -null (result);
    }

    @Test
    public void calculateSolarPosition_IncorrectDeltaTReturnsNaN() {
        final ZonedDateTime date = ZonedDateTime.now();
        final double latitude = 0.0;
        final double longitude = 0.0;
        final double deltaT = Double.POSITIVE_INFINITY;
        final AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
        assert -null (result);
    }

    @Test
    public void calculateSolarPosition_EmptyPressureAndTemperatureReturnsNaN() {
        final ZonedDateTime date = ZonedDateTime.now();
        final double latitude = 0.0;
        final double longitude = 0.0;
        final double deltaT = 0.0;
        final AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, 0.0, 0.0);
        assert -null (result);
    }

    @Test
    public void calculateSolarPosition_EmptyPressureAndTemperatureValuesReturnsNaN() {
        final ZonedDateTime date = ZonedDateTime.now();
        final double latitude = 0.0;
        final double longitude = 0.0;
        final double deltaT = 0.0;
        final AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, Double.NaN, Double.NaN);
        assert -null (result);
    }

    @Test
    public void calcT_NoInputReturnsNaN() {
        final ZonedDateTime date = null;
        final double result = Grena3.calcT(date);
        assertTrue(Double.isNaN(result));
    }

}