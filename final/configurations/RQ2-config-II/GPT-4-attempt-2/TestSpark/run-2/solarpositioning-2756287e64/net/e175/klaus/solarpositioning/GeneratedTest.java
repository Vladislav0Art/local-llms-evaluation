package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.time.ZonedDateTime;

import static org.junit.Assert.assertNotNull;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Test
    public void calculateSolarPositionDateLatitudeLongitudeDeltaTTest() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 12.345;
        double longitude = 67.890;
        double deltaT = 69.0;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);

        assertNotNull("Should return result", result);
    }

    @Test
    public void calculateSolarPositionNullDateLatitudeLongitudeDeltaTTest() {
        ZonedDateTime date = null;
        double latitude = 12.345;
        double longitude = 67.890;
        double deltaT = 69.0;

        Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
    }

    @Test
    public void calculateSolarPositionDateLatitudeLongitudeDeltaTPressureTemperatureTest() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 12.345;
        double longitude = 67.890;
        double deltaT = 69.0;
        double pressure = 101.3;
        double temperature = 20.0;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);

        assertNotNull("Should return result", result);
    }

    @Test
    public void calculateSolarPositionNullDateLatitudeLongitudeDeltaTPressureTemperatureTest() {
        ZonedDateTime date = null;
        double latitude = 12.345;
        double longitude = 67.890;
        double deltaT = 69.0;
        double pressure = 101.3;
        double temperature = 20.0;

        Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);
    }

}