package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestCalculateSolarPositionNoLatitude {

    @Test
    public void testCalculateSolarPositionNoLatitude() {
        when(latitude()).thenReturn(null);
        ZonedDateTime date = new ZonedDateTime(2022, 1, 1, 12, 0, 0, ZoneOffset.UTC);
        double longitude = -122.4194;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, null, longitude, 10);

        assertEquals(-122.4194, result.getLongitude(), 5);
    }

}