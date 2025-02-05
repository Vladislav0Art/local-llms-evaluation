package net.e175.klaus.solarpositioning;

import static org.junit.Assert.*;

import org.junit.Test;
import net.e175.klaus.solarpositioning.Grena3;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class GeneratedCalculateSolarPositionWithPressureTemperatureTest {

    @Test
    public void calculateSolarPositionWithPressureTemperatureTest() {
        ZonedDateTime date = ZonedDateTime.of(2021, 8, 30, 12, 0, 0, 0, ZoneOffset.UTC);
        double latitude = 40.7128;
        double longitude = -74.0060;
        double deltaT = 69.0;
        double pressure = 997.0;
        double temperature = 25.0;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);

        assertNotNull("Result cannot be null", result);
    }

}