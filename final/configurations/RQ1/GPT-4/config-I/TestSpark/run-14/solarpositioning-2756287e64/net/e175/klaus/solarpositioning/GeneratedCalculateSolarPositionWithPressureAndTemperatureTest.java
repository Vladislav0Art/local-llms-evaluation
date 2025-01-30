package net.e175.klaus.solarpositioning;

import static org.junit.Assert.*;

import java.time.ZonedDateTime;

import org.junit.Test;

public class GeneratedCalculateSolarPositionWithPressureAndTemperatureTest {

    @Test
    public void calculateSolarPositionWithPressureAndTemperatureTest() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 52.5200;
        double longitude = 13.4050;
        double deltaT = 70.25;
        double pressure = 1000.0;
        double temperature = 20.0;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);

        assertNotNull(result);
    }

}