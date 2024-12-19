package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestCalculateSolarPosition_RandomFixtures {

    @Test
    public void testCalculateSolarPosition_RandomFixtures() {
        ZonedDateTime date = new ZonedDateTime(2022, 1, 1, 12, 0);
        double latitude = 52.5206; // Berlin
        double longitude = -13.4055;
        double deltaT = Math.random();
        double pressure = Math.random();
        double temperature = Math.random();

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);

        assertEquals(42.1, result.getAzimuth(), 0.01);
    }

}