package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTest {

    @Test
    public void testCalculateSolarPosition_LatitudeLongitude_DeltaT_SolarAngle() {
        ZonedDateTime date = ZonedDateTime.of(2022, 1, 15, 12, 0, 0);
        double latitude = 52.520833;
        double longitude = -13.405556;
        double deltaT = 16; // minutes
        Grena3.SolarPosition solarAngle = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
        assertEquals(37.77, solarAngle.getAzimuth(), 0.01);
    }

    @Test
    public void testCalculateSolarPosition_LatitudeLongitude_DeltaT_SolarElevation() {
        ZonedDateTime date = ZonedDateTime.of(2022, 1, 15, 12, 0, 0);
        double latitude = 52.520833;
        double longitude = -13.405556;
        double deltaT = 16; // minutes
        Grena3.SolarPosition solarElevation = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
        assertEquals(37.77, solarElevation.getElevation(), 0.01);
    }

    @Test
    public void testCalculateSolarPosition_LatitudeLongitude_PressureTemperature_SolarAngle() {
        ZonedDateTime date = ZonedDateTime.of(2022, 1, 15, 12, 0, 0);
        double latitude = 52.520833;
        double longitude = -13.405556;
        double deltaT = 16; // minutes
        double pressure = 1013; // hPa
        double temperature = 25; // degrees Celsius
        Grena3.SolarPosition solarAngle = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);
        assertEquals(37.77, solarAngle.getAzimuth(), 0.01);
    }

    @Test
    public void testCalculateSolarPosition_LatitudeLongitude_PressureTemperature_SolarElevation() {
        ZonedDateTime date = ZonedDateTime.of(2022, 1, 15, 12, 0, 0);
        double latitude = 52.520833;
        double longitude = -13.405556;
        double deltaT = 16; // minutes
        double pressure = 1013; // hPa
        double temperature = 25; // degrees Celsius
        Grena3.SolarPosition solarElevation = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);
        assertEquals(37.77, solarElevation.getElevation(), 0.01);
    }

}