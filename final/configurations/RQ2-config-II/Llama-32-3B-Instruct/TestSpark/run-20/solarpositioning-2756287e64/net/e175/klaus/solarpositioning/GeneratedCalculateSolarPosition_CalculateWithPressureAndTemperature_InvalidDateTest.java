package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import static java.lang.Math.*;

public class GeneratedCalculateSolarPosition_CalculateWithPressureAndTemperature_InvalidDateTest {

    @Test
    public void calculateSolarPosition_CalculateWithPressureAndTemperature_InvalidDateTest() {
        ZonedDateTime date = null;
        double latitude = 52.5200;
        double longitude = 13.4051;
        double pressure = 101325;
        double temperature = 20;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, 10, pressure, temperature);
        assertNull(result);
    }

}