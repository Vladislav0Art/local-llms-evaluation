package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.when;

public class GeneratedTestCalculateSolarPosition_SingleArgumentWithNegativeLongitude {

    @Test
    public void testCalculateSolarPosition_SingleArgumentWithNegativeLongitude() {
        ZonedDateTime date = mock(ZonedDateTime.class);
        double latitude = 30.0;
        double longitude = -110.0;

        when(date.toZone(ZoneOffset.ofHours(-5))).thenReturn(ZoneOffset.ofHours(12));
        Grena3.calculateSolarPosition(latitude, longitude);

        verifyZeroMethods();
    }

}