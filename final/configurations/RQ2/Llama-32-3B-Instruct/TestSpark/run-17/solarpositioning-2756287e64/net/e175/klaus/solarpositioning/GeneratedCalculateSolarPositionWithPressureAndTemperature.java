package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.lang.Math;

public class GeneratedCalculateSolarPositionWithPressureAndTemperature {

    @Test
    public void calculateSolarPositionWithPressureAndTemperature() {
        ZonedDateTime date = ZonedDateTime.of(2022, 1, 1, 12, 0, 0, ZoneOffset.UTC);
        double latitude = 48.8567;
        double longitude = 2.3508;
        double pressure = 1013;
        double temperature = 15;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, 5, pressure, temperature);
        assertNotNull(result);
    }

}