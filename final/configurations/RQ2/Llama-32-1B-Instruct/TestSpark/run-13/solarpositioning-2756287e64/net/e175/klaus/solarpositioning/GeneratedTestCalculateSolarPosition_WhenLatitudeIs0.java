package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestCalculateSolarPosition_WhenLatitudeIs0 {

    @Test
    public void testCalculateSolarPosition_WhenLatitudeIs0() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double longitude = 0;

        when(date.getZone()).thenReturn(ZoneId.of("UTC"));
        when(latitude).thenReturn(0);

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, 0, longitude, 0);

        assertEquals(AzimuthZenithAngle.ZERO_AZIMUTH_ZENITH_ANGLE, result);
    }

}