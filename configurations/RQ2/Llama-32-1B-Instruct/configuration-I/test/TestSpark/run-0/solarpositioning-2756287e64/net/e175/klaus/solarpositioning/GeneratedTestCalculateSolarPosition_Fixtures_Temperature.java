package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestCalculateSolarPosition_Fixtures_Temperature {

    @Test
    public void testCalculateSolarPosition_Fixtures_Temperature() {
        ZonedDateTime date = new ZonedDateTime(2022, 1, 1, 12, 0);
        double latitude = 52.5206; // Berlin
        double longitude = -13.4055;
        double deltaT = 30;
        double temperature = 20;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, temperature);

        assertEquals(42.1, result.getAzimuth(), 0.01);
    }

}