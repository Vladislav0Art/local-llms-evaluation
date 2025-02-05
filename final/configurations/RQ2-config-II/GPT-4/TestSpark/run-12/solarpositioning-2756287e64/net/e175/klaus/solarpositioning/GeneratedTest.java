package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.Grena3;
import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class GeneratedTest {

    @Test
    public void calculateSolarPositionTestWithFourParameters() {
        ZonedDateTime testDate = ZonedDateTime.of(2022, 4, 1, 12, 0, 0, 0, ZoneOffset.UTC);
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(testDate, 52.5200, 13.4050, 70.0);

        assertNotNull(result);
    }

    @Test
    public void calculateSolarPositionTestWithInvalidLatitude() {
        ZonedDateTime testDate = ZonedDateTime.of(2021, 4, 1, 12, 0, 0, 0, ZoneOffset.UTC);
        Grena3.calculateSolarPosition(testDate, 91.0, 13.4050, 70.0); // Latitude is over 90
    }

    @Test
    public void calculateSolarPositionTestWithInvalidLongitude() {
        ZonedDateTime testDate = ZonedDateTime.of(2021, 4, 1, 12, 0, 0, 0, ZoneOffset.UTC);
        Grena3.calculateSolarPosition(testDate, 52.5200, -181.0, 70.0); // Longitude is over 180 or below -180
    }

    @Test
    public void calculateSolarPositionTestWithSixParameters() {
        ZonedDateTime testDate = ZonedDateTime.of(2022, 4, 1, 12, 0, 0, 0, ZoneOffset.UTC);
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(testDate, 52.5200, 13.4050, 70.0, 1013, 25);

        assertNotNull(result);
    }

    @Test
    public void calculateSolarPositionTestInvalidPressure() {
        ZonedDateTime testDate = ZonedDateTime.of(2022, 4, 1, 12, 0, 0, 0, ZoneOffset.UTC);
        Grena3.calculateSolarPosition(testDate, 52.5200, 13.4050, 70.0, -5, 25); // Pressure cannot be negative
    }

    @Test
    public void calculateSolarPositionTestInvalidTemperature() {
        ZonedDateTime testDate = ZonedDateTime.of(2022, 4, 1, 12, 0, 0, 0, ZoneOffset.UTC);
        Grena3.calculateSolarPosition(testDate, 52.5200, 13.4050, 70.0, 1013, 1000); // Too high temperature
    }

}