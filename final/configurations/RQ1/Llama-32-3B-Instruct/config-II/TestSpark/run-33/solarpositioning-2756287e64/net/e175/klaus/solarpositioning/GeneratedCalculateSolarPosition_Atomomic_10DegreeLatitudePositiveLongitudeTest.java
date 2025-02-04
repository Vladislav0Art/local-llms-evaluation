package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSolarPosition_Atomomic_10DegreeLatitudePositiveLongitudeTest {

    @Test
    public void calculateSolarPosition_Atomomic_10DegreeLatitudePositiveLongitudeTest() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 10.0;
        double longitude = 20.0;
        double deltaT = 0.0;
        double pressure = 1000.0;
        double temperature = -273.15;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);
        assertEquals(250.0, (double) result.getAzimuth(), 1e-5);
    }

}