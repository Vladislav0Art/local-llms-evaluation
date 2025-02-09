package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import net.e175.klaus.solarpositioning.Grena3;
import org.junit.Test;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import static org.junit.Assert.assertNotNull;

public class GeneratedTest {

    @Test
    public void calculateSolarPositionFourParametersTest() {
        ZonedDateTime date = ZonedDateTime.now(ZoneId.of("UTC"));
        double latitude = 74.6;
        double longitude = 0.984;
        double deltaT = 20.2342;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
        assertNotNull(result);
    }

    @Test
    public void calculateSolarPositionSixParametersTest() {
        ZonedDateTime date = ZonedDateTime.now(ZoneId.of("UTC"));
        double latitude = 74.6;
        double longitude = 0.984;
        double deltaT = 20.2342;
        double pressure = 29.92;
        double temperature = 60.8;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);
        assertNotNull(result);
    }

    @Test
    public void calculateSolarPositionInvalidLatitudeTest() {
        ZonedDateTime date = ZonedDateTime.now(ZoneId.of("UTC"));
        double latitude = 200.0;
        double longitude = 0.984;
        double deltaT = 20.2342;
        Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
    }

    @Test
    public void calculateSolarPositionInvalidLongitudeTest() {
        ZonedDateTime date = ZonedDateTime.now(ZoneId.of("UTC"));
        double latitude = 74.6;
        double longitude = 200.0;
        double deltaT = 20.2342;
        Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
    }

    @Test
    public void calculateSolarPositionInvalidDeltaTTest() {
        ZonedDateTime date = ZonedDateTime.now(ZoneId.of("UTC"));
        double latitude = 74.6;
        double longitude = 0.984;
        double deltaT = 2000.0;
        Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
    }

    @Test
    public void calculateSolarPositionInvalidPressureTest() {
        ZonedDateTime date = ZonedDateTime.now(ZoneId.of("UTC"));
        double latitude = 74.6;
        double longitude = 0.984;
        double deltaT = 20.2342;
        double pressure = -10.0;
        double temperature = 60.8;
        Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);
    }

    @Test
    public void calculateSolarPositionInvalidTemperatureTest() {
        ZonedDateTime date = ZonedDateTime.now(ZoneId.of("UTC"));
        double latitude = 74.6;
        double longitude = 0.984;
        double deltaT = 20.2342;
        double pressure = 29.92;
        double temperature = -60.8;
        Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);
    }

}