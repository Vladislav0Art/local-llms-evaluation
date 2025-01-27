package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.lang.Math;

import org.mockito.Mockito;

public class GeneratedCalculateSolarPosition_AccurateMode_TemperatureZero_ReturnsExpectedValue {

    @Test
    public void calculateSolarPosition_AccurateMode_TemperatureZero_ReturnsExpectedValue() {
        ZonedDateTime date = ZonedDateTime.of(2022, 6, 20, 0, 0, 0, 0, ZoneOffset.UTC);
        double latitude = 52.5200;
        double longitude = 13.4050;
        double deltaT = 10;
        double pressure = 101325;
        double temperature = 0;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);
        assertNotNull(result);
    }

}