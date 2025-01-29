package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestCalculateSolarPositionWithDeltaT {

    @Test
    public void testCalculateSolarPositionWithDeltaT() {
        when(deltaT()).thenReturn(10);
        ZonedDateTime date = new ZonedDateTime(2022, 1, 1, 12, 0, 0, ZoneOffset.UTC);
        double latitude = 37.7749;
        double longitude = -122.4194;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, 10);

        assertEquals(25.032, result.getAzimuth(), 5);
    }

}