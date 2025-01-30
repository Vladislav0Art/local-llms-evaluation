package net.e175.klaus.solarpositioning;

import org.junit.Test;
import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import net.e175.klaus.solarpositioning.Grena3;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import static org.junit.Assert.*;

public class GeneratedCalculateSolarPositionUseInvalidPressureAndTemperatureTest {

    @Test
    public void calculateSolarPositionUseInvalidPressureAndTemperatureTest() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 90.0; // North Pole
        double longitude = 0.0; // Prime Meridian
        double deltaT = 69.182; // Delta T for 2021
        double pressure = 5000.0; // Invalid pressure
        double temperature = 500.0; // Invalid temperature
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);
        assertNotNull(result);
    }

}