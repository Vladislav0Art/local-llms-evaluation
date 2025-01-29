package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.function.Function;

public class GeneratedTestCalculateSolarPosition_NoDeltaT {

    @Test
    public void testCalculateSolarPosition_NoDeltaT() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 37.7749;
        double longitude = -122.4194;
        double pressure = 101325;
        double temperature = 288.15;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, 0);

        assertEquals(0, result.getAzimuth());
        assertEquals(360, result.getZenith());
    }

}