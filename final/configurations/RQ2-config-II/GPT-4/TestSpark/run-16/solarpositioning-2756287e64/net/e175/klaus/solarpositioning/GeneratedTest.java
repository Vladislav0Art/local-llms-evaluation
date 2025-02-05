package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.ZonedDateTime;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void calculateSolarPositionDateLatitudeLongitudeDeltaT_ValidInputs_Test() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 42.3601;
        double longitude = -71.0589;
        double deltaT = 67;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);

        assertNotNull(result);
    }

    @Test
    public void calculateSolarPositionDateLatitudeLongitudeDeltaT_NullDate_Test() {
        ZonedDateTime date = null;
        double latitude = 42.3601;
        double longitude = -71.0589;
        double deltaT = 67;

        Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
    }

    @Test
    public void calculateSolarPositionDateLatitudeLongitudeDeltaTPressureTemperature_ValidInputs_Test() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 42.3601;
        double longitude = -71.0589;
        double deltaT = 67;
        double pressure = 1000;
        double temperature = 20;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);

        assertNotNull(result);
    }

    @Test
    public void calculateSolarPositionDateLatitudeLongitudeDeltaTPressureTemperature_NullDate_Test() {
        ZonedDateTime date = null;
        double latitude = 42.3601;
        double longitude = -71.0589;
        double deltaT = 67;
        double pressure = 1000;
        double temperature = 20;

        Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);
    }

}