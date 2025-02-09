package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.ZonedDateTime;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Test
    public void calculateSolarPositionTest() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = -37.81;
        double longitude = 144.96;
        double deltaT = 70;

        AzimuthZenithAngle azimuthZenithAngle = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
        assertNotNull(azimuthZenithAngle);
    }

    @Test
    public void calculateSolarPositionInvalidLatitudeTest() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = -100.0;
        double longitude = 144.96;
        double deltaT = 70;

        Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
    }

    @Test
    public void calculateSolarPositionInvalidLongitudeTest() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = -37.81;
        double longitude = 200.0;
        double deltaT = 70;

        Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
    }

    @Test
    public void calculateSolarPositionWithPressureAndTemperatureTest() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = -37.81;
        double longitude = 144.96;
        double deltaT = 70;
        double pressure = 1010;
        double temperature = 25;

        AzimuthZenithAngle azimuthZenithAngle = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);
        assertNotNull(azimuthZenithAngle);
    }

    @Test
    public void calculateSolarPositionInvalidPressureTest() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = -37.81;
        double longitude = 144.96;
        double deltaT = 70;
        double pressure = -1000;
        double temperature = 25;

        Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);
    }

    @Test
    public void calculateSolarPositionInvalidTemperatureTest() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = -37.81;
        double longitude = 144.96;
        double deltaT = 70;
        double pressure = 1010;
        double temperature = -300;

        Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);
    }

}