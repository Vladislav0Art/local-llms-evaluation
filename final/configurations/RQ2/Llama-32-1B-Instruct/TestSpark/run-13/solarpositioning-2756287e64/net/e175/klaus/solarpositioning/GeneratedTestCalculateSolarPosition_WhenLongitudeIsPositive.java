package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestCalculateSolarPosition_WhenLongitudeIsPositive {

    @Test
    public void testCalculateSolarPosition_WhenLongitudeIsPositive() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double longitude = 1;

        when(date.getZone()).thenReturn(ZoneId.of("UTC"));
        when(latitude).thenReturn(0);

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, 0);

        assertEquals(AzimuthZenithAngle.SOUTH_AZIMUTH_ZENITH_ANGLE, result);
    }

}