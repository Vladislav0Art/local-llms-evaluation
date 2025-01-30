package net.e175.klaus.solarpositioning;

import static org.junit.Assert.*;

import java.time.ZonedDateTime;

import org.junit.Test;

public class GeneratedTest {

    @Test
    public void calculateSolarPositionDateLatitudeLongitudeDeltaTTest() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 42.3601;
        double longitude = -71.0589;
        double deltaT = 68.8033;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);

        assertNotNull(result);
    }

    @Test
    public void calculateSolarPositionDateLatitudeLongitudeDeltaTMinValuesTest() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = -90;
        double longitude = -180;
        double deltaT = -2000;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);

        assertNotNull(result);
    }

    @Test
    public void calculateSolarPositionDateLatitudeLongitudeDeltaTMaxValuesTest() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 90;
        double longitude = 180;
        double deltaT = 2000;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);

        assertNotNull(result);
    }

    @Test
    public void calculateSolarPositionWithPressureAndTemperatureTest() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 52.5200;
        double longitude = 13.4050;
        double deltaT = 70.25;
        double pressure = 1000.0;
        double temperature = 20.0;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);

        assertNotNull(result);
    }

    @Test
    public void calculateSolarPositionWithPressureAndTemperatureMinValuesTest() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = -90;
        double longitude = -180;
        double deltaT = -2000;
        double pressure = 0.0;
        double temperature = -273.0;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);

        assertNotNull(result);
    }

    @Test
    public void calculateSolarPositionWithPressureAndTemperatureMaxValuesTest() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 90;
        double longitude = 180;
        double deltaT = 2000;
        double pressure = 3000.0;
        double temperature = 273.0;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);

        assertNotNull(result);
    }

}