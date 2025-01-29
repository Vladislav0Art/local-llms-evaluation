package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.when;

public class GeneratedTestCalculateSolarPosition_GeolocationWithNoArguments {

    @Test
    public void testCalculateSolarPosition_GeolocationWithNoArguments() {
        ZonedDateTime date = mock(ZonedDateTime.class);
        double latitude = 30.0;
        double longitude = -100.0;

        when(date.toZone(ZoneOffset.ofHours(-5))).thenReturn(ZoneOffset.ofHours(12));
        Grena3.calculateSolarPosition();
    }

}