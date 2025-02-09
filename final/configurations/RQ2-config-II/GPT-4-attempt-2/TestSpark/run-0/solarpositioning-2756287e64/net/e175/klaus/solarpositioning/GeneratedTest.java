package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZonedDateTime;

import net.e175.klaus.solarpositioning.Grena3;
import net.e175.klaus.solarpositioning.AzimuthZenithAngle;

public class GeneratedTest {

    @Test
    public void calculateSolarPositionTestWithFiveParams() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 51.5074;
        double longitude = 0.1278;
        double deltaT = 67.0;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);

        assertNotNull("Error: The result should not be null", result);
        assertTrue("Error: Azimuth should be between 0 and 360", result.getAzimuth() >= 0 && result.getAzimuth() <= 360);
        assertTrue("Error: Zenith angle should be between 0 and 90", result.getZenithAngle() >= 0 && result.getZenithAngle() <= 90);
    }

    @Test
    public void calculateSolarPositionTestWithSevenParams() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 51.5074;
        double longitude = 0.1278;
        double deltaT = 67.0;
        double pressure = 1013.25;
        double temperature = 15;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);

        assertNotNull("Error: The result should not be null", result);
        assertTrue("Error: Azimuth should be between 0 and 360", result.getAzimuth() >= 0 && result.getAzimuth() <= 360);
        assertTrue("Error: Zenith angle should be between 0 and 90", result.getZenithAngle() >= 0 && result.getZenithAngle() <= 90);
    }

    @Test
    public void calculateSolarPositionTestWithInvalidLatitude() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 91.0;
        double longitude = 0.1278;
        double deltaT = 67.0;

        Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
    }

    @Test
    public void calculateSolarPositionTestWithInvalidLongitude() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 51.5074;
        double longitude = 180.1;
        double deltaT = 67.0;

        Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
    }

    @Test
    public void calculateSolarPositionTestWithInvalidPressure() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 51.5074;
        double longitude = 0.1278;
        double deltaT = 67.0;
        double pressure = -1;
        double temperature = 15;

        Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);
    }

    @Test
    public void calculateSolarPositionTestWithInvalidTemperature() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 51.5074;
        double longitude = 0.1278;
        double deltaT = 67.0;
        double pressure = 1013.25;
        double temperature = -275;

        Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);
    }

}