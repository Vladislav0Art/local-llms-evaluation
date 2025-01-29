package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.when;

public class GeneratedTestCalculateSolarPosition_SingleArgumentWithNonFiniteLongitude {

    @Test
    public void testCalculateSolarPosition_SingleArgumentWithNonFiniteLongitude() {
        ZonedDateTime date = mock(ZonedDateTime.class);
        double latitude = 30.0;
        double longitude = 1e308;

        when(date.toZone(ZoneOffset.ofHours(-5))).thenReturn(ZoneOffset.ofHours(12));
        Grena3.calculateSolarPosition(latitude, longitude);

        verifyZeroMethods();
    }

    private void verifyZeroMethods() {
        verifyZeroMethods();
    }

}