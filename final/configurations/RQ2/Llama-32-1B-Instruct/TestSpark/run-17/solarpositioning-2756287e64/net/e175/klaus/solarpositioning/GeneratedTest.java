package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZoneOffset;
import java.util.UUID;

public class GeneratedTest {

    @Test
    public void testCalculateSolarPosition_noDeltaT() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 52.52083333;
        double longitude = -13.40527778;
        double pressure = 101325;
        double temperature = 288 K;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, 0);

        assertTrue(result.getR() > 0);
        assertTrue(result.getTheta() > 0);
    }

    @Test
    public void testCalculateSolarPosition_zeroDeltaT() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 52.52083333;
        double longitude = -13.40527778;
        double pressure = 101325;
        double temperature = 288 K;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, 0, 273);

        assertTrue(result.getR() > 0);
        assertTrue(result.getTheta() > 0);
    }

    @Test
    public void testCalculateSolarPosition_smallDeltaT() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 52.52083333;
        double longitude = -13.40527778;
        double pressure = 101325;
        double temperature = 288 K;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, 0.1);

        assertTrue(result.getR() > 0);
        assertTrue(result.getTheta() > 0);
    }

    @Test
    public void testCalculateSolarPosition_largeDeltaT() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 52.52083333;
        double longitude = -13.40527778;
        double pressure = 101325;
        double temperature = 288 K;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, 10);

        assertTrue(result.getR() > 0);
        assertTrue(result.getTheta() > 0);
    }

    @Test
    public void testCalculateSolarPosition_mismatchedDeltaT() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 52.52083333;
        double longitude = -13.40527778;
        double pressure = 101325;
        double temperature = 288 K;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, 0, 305);

        assertTrue(result.getR() > 0);
        assertTrue(result.getTheta() > 0);
    }

    @Test
    public void testCalculateSolarPosition_noPressureOrTemperature() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 52.52083333;
        double longitude = -13.40527778;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, 0);

        assertTrue(result.getR() > 0);
        assertTrue(result.getTheta() > 0);
    }

    @Test
    public void testCalculateSolarPosition_noLatitudeOrLongitude() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 52.52083333;
        double longitude = -13.40527778;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, 0);

        assertTrue(result.getR() > 0);
        assertTrue(result.getTheta() > 0);
    }

    @Test
    public void testCalculateSolarPosition_noDeltaTAndPressureOrTemperature() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 52.52083333;
        double longitude = -13.40527778;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, 0, 305);

        assertTrue(result.getR() > 0);
        assertTrue(result.getTheta() > 0);
    }

    @Test
    public void testCalculateSolarPosition_mismatchedPressureAndTemperature() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 52.52083333;
        double longitude = -13.40527778;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, 101325, 288);

        assertTrue(result.getR() > 0);
        assertTrue(result.getTheta() > 0);
    }

    @Test
    public void testCalculateSolarPosition_mismatchedTemperatureAndPressure() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 52.52083333;
        double longitude = -13.40527778;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, 288, 101325);

        assertTrue(result.getR() > 0);
        assertTrue(result.getTheta() > 0);
    }

    @Test
    public void testCalculateSolarPosition_mismatchedDeltaTAndPressureOrTemperature() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 52.52083333;
        double longitude = -13.40527778;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, 0.1, 101325);

        assertTrue(result.getR() > 0);
        assertTrue(result.getTheta() > 0);
    }

    @Test
    public void testCalculateSolarPosition_mismatchedDeltaTAndPressureOrTemperatureAndLatitudeLongitude() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 52.52083333;
        double longitude = -13.40527778;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, 0.1, 101325);

        assertTrue(result.getR() > 0);
        assertTrue(result.getTheta() > 0);
    }

    @Test
    public void testCalculateSolarPosition_mismatchedDeltaTAndPressureOrTemperatureAndLatitudeLongitudeAndPressure() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 52.52083333;
        double longitude = -13.40527778;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, 0.1, 101325, 305);

        assertTrue(result.getR() > 0);
        assertTrue(result.getTheta() > 0);
    }

    @Test
    public void testCalculateSolarPosition_mismatchedDeltaTAndPressureOrTemperatureAndLatitudeLongitudeAndPressureAndTemperature() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 52.52083333;
        double longitude = -13.40527778;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, 0.1, 101325, 288);

        assertTrue(result.getR() > 0);
        assertTrue(result.getTheta() > 0);
    }

    @Test
    public void testCalculateSolarPosition_mismatchedDeltaTAndPressureOrTemperatureAndLatitudeLongitudeAndPressureAndDeltaT() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 52.52083333;
        double longitude = -13.40527778;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, 0.1, 101325, 305);

        assertTrue(result.getR() > 0);
        assertTrue(result.getTheta() > 0);
    }

    @Test
    public void testCalculateSolarPosition_mismatchedDeltaTAndPressureOrTemperatureAndLatitudeLongitudeAndPressureAndDeltaTAndLatitudeLongitude() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 52.52083333;
        double longitude = -13.40527778;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, 0.1, 101325, 288);

        assertTrue(result.getR() > 0);
        assertTrue(result.getTheta() > 0);
    }

    @Test
    public void testCalculateSolarPosition_mismatchedDeltaTAndPressureOrTemperatureAndLatitudeLongitudeAndPressureAndDeltaTAndLatitudeLongitudeAndPressure() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 52.52083333;
        double longitude = -13.40527778;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, 0.1, 101325, 288);

        assertTrue(result.getR() > 0);
        assertTrue(result.getTheta() > 0);
    }

}