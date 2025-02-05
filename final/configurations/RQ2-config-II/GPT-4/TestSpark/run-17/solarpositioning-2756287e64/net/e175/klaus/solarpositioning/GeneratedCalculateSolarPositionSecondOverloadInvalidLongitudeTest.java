package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.ZonedDateTime;

import static org.junit.Assert.assertNotNull;

public class GeneratedCalculateSolarPositionSecondOverloadInvalidLongitudeTest {

    @Test
    public void calculateSolarPositionSecondOverloadInvalidLongitudeTest() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 100.0;
        double longitude = -200.0;
        double deltaT = 70.0;
        double pressure = 1000.0;
        double temperature = 20.0;

        Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);
    }

}