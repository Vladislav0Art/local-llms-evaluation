package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSolarPosition_ThreeParameterTest {

    @Test
    public void calculateSolarPosition_ThreeParameterTest() {
        ZonedDateTime date = ZonedDateTime.now();
        double pressure = 101325;
        double temperature = 293.15;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, 52.5200, 13.4050, pressure, temperature);
        assertEquals(181.94, result.getAzimuth(), 0.01);
    }

}