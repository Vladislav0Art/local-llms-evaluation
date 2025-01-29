package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.function.Function;

public class GeneratedTestCalculateSolarPosition_NoDeltaTWithNoPressure {

    @Test
    public void testCalculateSolarPosition_NoDeltaTWithNoPressure() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 37.7749;
        double longitude = -122.4194;
        double temperature = 288.15;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, temperature);

        assertEquals(0, result.getAzimuth());
        assertEquals(360, result.getZenith());
    }

}