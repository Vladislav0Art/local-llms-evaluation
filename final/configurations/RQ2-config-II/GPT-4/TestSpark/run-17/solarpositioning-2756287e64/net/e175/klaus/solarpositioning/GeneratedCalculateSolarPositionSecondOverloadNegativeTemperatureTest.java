package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.ZonedDateTime;

import static org.junit.Assert.assertNotNull;

public class GeneratedCalculateSolarPositionSecondOverloadNegativeTemperatureTest {

    @Test
    public void calculateSolarPositionSecondOverloadNegativeTemperatureTest() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 45.0;
        double longitude = 45.0;
        double deltaT = 70.0;
        double pressure = 1000.0;
        double temperature = -1;

        Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);
    }

}