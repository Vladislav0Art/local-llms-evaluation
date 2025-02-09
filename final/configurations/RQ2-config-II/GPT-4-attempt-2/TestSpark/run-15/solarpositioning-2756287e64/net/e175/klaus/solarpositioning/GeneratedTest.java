package net.e175.klaus.solarpositioning;

import org.junit.Test;
import net.e175.klaus.solarpositioning.Grena3;
import net.e175.klaus.solarpositioning.AzimuthZenithAngle;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import static org.junit.Assert.assertNotNull;

public class GeneratedTest {

    @Test
    public void calculateSolarPositionDateLatitudeLongitudeDeltaTTest() {
        ZonedDateTime time = ZonedDateTime.of(2022, 1, 1, 12, 0, 0, 0, ZoneId.systemDefault());
        double latitude = 60.0;
        double longitude = 24.0;
        double deltaT = 68.0;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(time, latitude, longitude, deltaT);
        assertNotNull(result);
    }

    @Test
    public void calculateSolarPositionInvalidLatitudeTest() {
        ZonedDateTime time = ZonedDateTime.of(2022, 1, 1, 12, 0, 0, 0, ZoneId.systemDefault());
        double invalid_latitude = 200.0;
        double longitude = 24.0;
        double deltaT = 68.0;

        Grena3.calculateSolarPosition(time, invalid_latitude, longitude, deltaT);
    }

    @Test
    public void calculateSolarPositionInvalidLongitudeTest() {
        ZonedDateTime time = ZonedDateTime.of(2022, 1, 1, 12, 0, 0, 0, ZoneId.systemDefault());
        double latitude = 60.0;
        double invalid_longitude = 200.0;
        double deltaT = 68.0;

        Grena3.calculateSolarPosition(time, latitude, invalid_longitude, deltaT);
    }

    @Test
    public void calculateSolarPositionDateLatitudeLongitudeDeltaTPressureTemperatureTest() {
        ZonedDateTime time = ZonedDateTime.of(2022, 1, 1, 12, 0, 0, 0, ZoneId.systemDefault());
        double latitude = 60.0;
        double longitude = 24.0;
        double deltaT = 68.0;
        double pressure = 1000.0;
        double temperature = 20.0;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(time, latitude, longitude, deltaT, pressure, temperature);
        assertNotNull(result);
    }

    @Test
    public void calculateSolarPositionInvalidPressureTest() {
        ZonedDateTime time = ZonedDateTime.of(2022, 1, 1, 12, 0, 0, 0, ZoneId.systemDefault());
        double latitude = 60.0;
        double longitude = 24.0;
        double deltaT = 68.0;
        double invalid_pressure = -500.0;
        double temperature = 20.0;

        Grena3.calculateSolarPosition(time, latitude, longitude, deltaT, invalid_pressure, temperature);
    }

    @Test
    public void calculateSolarPositionInvalidTemperatureTest() {
        ZonedDateTime time = ZonedDateTime.of(2022, 1, 1, 12, 0, 0, 0, ZoneId.systemDefault());
        double latitude = 60.0;
        double longitude = 24.0;
        double deltaT = 68.0;
        double pressure = 1000.0;
        double invalid_temperature = -300.0;

        Grena3.calculateSolarPosition(time, latitude, longitude, deltaT, pressure, invalid_temperature);
    }

}