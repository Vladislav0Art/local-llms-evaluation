package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSolarPosition_CalculateSolarPositionWithPressureAndTemperatureValidDateAndAnglesTest {

    @Test
    public void calculateSolarPosition_CalculateSolarPositionWithPressureAndTemperatureValidDateAndAnglesTest() {
        ZonedDateTime date = ZonedDateTime.of(2000, 1, 1, 12, 0, 0, 0, ZoneOffset.UTC);
        double pressure = 1013.25;
        double temperature = 15.5;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, 45.0, -10.0, 2.5, pressure, temperature);
        assertNotNull(result);
    }

}