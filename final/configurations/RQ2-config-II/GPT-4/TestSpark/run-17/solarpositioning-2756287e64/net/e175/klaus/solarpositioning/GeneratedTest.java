package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.ZonedDateTime;

import static org.junit.Assert.assertNotNull;

public class GeneratedTest {

    @Test
    public void calculateSolarPositionFirstOverloadNormalValuesTest() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 45.0;
        double longitude = 45.0;
        double deltaT = 70.0;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);

        assertNotNull(result);
    }

    @Test
    public void calculateSolarPositionFirstOverloadNegativeDeltaTTest() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 45.0;
        double longitude = 45.0;
        double deltaT = -1;

        Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
    }

    @Test
    public void calculateSolarPositionFirstOverloadInvalidLatitudeTest() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 200.0;
        double longitude = 45.0;
        double deltaT = 70.0;

        Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
    }

    @Test
    public void calculateSolarPositionFirstOverloadInvalidLongitudeTest() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 45.0;
        double longitude = -200.0;
        double deltaT = 70.0;

        Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
    }

    @Test
    public void calculateSolarPositionSecondOverloadNormalValuesTest() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 45.0;
        double longitude = 45.0;
        double deltaT = 70.0;
        double pressure = 1000.0;
        double temperature = 20.0;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);

        assertNotNull(result);
    }

    @Test
    public void calculateSolarPositionSecondOverloadNegativePressureTest() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 45.0;
        double longitude = 45.0;
        double deltaT = 70.0;
        double pressure = -1;
        double temperature = 20.0;

        Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);
    }

    @Test
    public void calculateSolarPositionSecondOverloadNegativeTemperatureTest() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 45.0;
        double longitude = 45.0;
        double deltaT = 70.0;
        double pressure = 1000.0;
        double temperature = -1;

        Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);
    }

    @Test
    public void calculateSolarPositionSecondOverloadInvalidLatitudeTest() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 1000.0;
        double longitude = 100.0;
        double deltaT = 70.0;
        double pressure = 1000.0;
        double temperature = 20.0;

        Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);
    }

    @Test
    public void calculateSolarPositionSecondOverloadInvalidLongitudeTest() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 100.0;
        double longitude = -200.0;
        double deltaT = 70.0;
        double pressure = 1000.0;
        double temperature = 20.0;

        Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);
    }

}