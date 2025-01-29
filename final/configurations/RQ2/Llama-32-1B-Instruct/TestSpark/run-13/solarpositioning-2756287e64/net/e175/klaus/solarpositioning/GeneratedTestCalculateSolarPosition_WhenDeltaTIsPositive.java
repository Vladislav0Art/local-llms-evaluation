package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestCalculateSolarPosition_WhenDeltaTIsPositive {

    @Test
    public void testCalculateSolarPosition_WhenDeltaTIsPositive() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 1;
        double longitude = 0;

        when(date.getZone()).thenReturn(ZoneId.of("UTC"));
        when(latitude).thenReturn(1);

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, 1.0);

        assertEquals(AzimuthZenithAngle.SOUTH_AZIMUTH_ZENITH_ANGLE, result);
    }

}