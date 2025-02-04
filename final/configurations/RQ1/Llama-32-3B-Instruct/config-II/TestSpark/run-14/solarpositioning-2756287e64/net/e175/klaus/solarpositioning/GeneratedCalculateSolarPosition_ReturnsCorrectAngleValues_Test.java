package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedCalculateSolarPosition_ReturnsCorrectAngleValues_Test {

    @Test
    public void calculateSolarPosition_ReturnsCorrectAngleValues_Test() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 48.8566;
        double longitude = 2.3508;
        double deltaT = 0.0;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);

        assertEquals(1.0, result.getAzimuth(), 0.00001);
        assertEquals(-50.5, result.getZenith(), 0.001);
    }

}