package net.e175.klaus.solarpositioning;

import static org.junit.Assert.*;

import java.time.ZonedDateTime;

import org.junit.Test;

public class GeneratedCalculateSolarPositionWithPressureAndTemperatureMinValuesTest {

    @Test
    public void calculateSolarPositionWithPressureAndTemperatureMinValuesTest() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = -90;
        double longitude = -180;
        double deltaT = -2000;
        double pressure = 0.0;
        double temperature = -273.0;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);

        assertNotNull(result);
    }

}