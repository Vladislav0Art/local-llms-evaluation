package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestCalculateSolarPositionNoLongitude {

    @Test
    public void testCalculateSolarPositionNoLongitude() {
        when(longitude()).thenReturn(null);
        ZonedDateTime date = new ZonedDateTime(2022, 1, 1, 12, 0, 0, ZoneOffset.UTC);
        double latitude = 37.7749;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, null, 10);

        assertEquals(37.7749, result.getLatitude(), 5);
    }

}