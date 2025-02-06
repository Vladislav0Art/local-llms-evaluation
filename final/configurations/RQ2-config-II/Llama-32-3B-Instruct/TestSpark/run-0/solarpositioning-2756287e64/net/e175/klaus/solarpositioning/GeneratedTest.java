package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import static java.lang.Math.*;

public class GeneratedTest {

    @Test
    public void calculateSolarPosition_DatesAreDifferent_ReturnsDifferentAngles() {
        ZonedDateTime date1 = ZonedDateTime.now(ZoneOffset.UTC);
        ZonedDateTime date2 = ZonedDateTime.now(ZoneOffset.UTC).plusDays(1);

        AzimuthZenithAngle angle1 = Grena3.calculateSolarPosition(date1, 0.0, 0.0, 0.0);
        AzimuthZenithAngle angle2 = Grena3.calculateSolarPosition(date2, 0.0, 0.0, 0.0);

        AssertNotEquals(angle1, angle2);
    }

    @Test
    public void calculateSolarPosition_LatitudeZero_ReturnsDegenerateAngles() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 0.0;
        double longitude = 0.0;

        AzimuthZenithAngle angle = Grena3.calculateSolarPosition(date, latitude, longitude, 0.0);

        assertTrue(isEqual(angle.getAzimuth(), Double.POSITIVE_INFINITY));
        assertTrue(isEqual(angle.getZenith(), Double.POSITIVE_INFINITY));
    }

    @Test
    public void calculateSolarPosition_LatitudeNegative_ReturnsAnglesWithCorrectSign() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = -45.0;
        double longitude = 0.0;

        AzimuthZenithAngle angle = Grena3.calculateSolarPosition(date, latitude, longitude, 0.0);

        assertTrue(angle.getAzimuth() < 0.0);
    }

    @Test
    public void calculateSolarPosition_LongitudeNegative_ReturnsAnglesWithCorrectSign() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 0.0;
        double longitude = -45.0;

        AzimuthZenithAngle angle = Grena3.calculateSolarPosition(date, latitude, longitude, 0.0);

        assertTrue(angle.getZenith() < 0.0);
    }

    @Test
    public void calculateSolarPosition_CalculateWithPressureAndTemperature_ReturnsAnglesWithCorrectSign() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double pressure = 1023.0;
        double temperature = -10.0;

        AzimuthZenithAngle angle = Grena3.calculateSolarPosition(date, 0.0, 0.0, 0.0, pressure, temperature);

        assertTrue(angle.getAzimuth() < 0.0);
        assertTrue(angle.getZenith() > 0.0);
    }

}