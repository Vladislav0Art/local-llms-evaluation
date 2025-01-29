package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.when;

public class GeneratedTest {

    @Test
    public void testCalculateSolarPosition_Geolocation() {
        ZonedDateTime date = mock(ZonedDateTime.class);
        double latitude = 30.0;
        double longitude = -100.0;
        when(date.toZone(ZoneOffset.ofHours(-5))).thenReturn(ZoneOffset.ofHours(12));

        Grena3.calculateSolarPosition(latitude, longitude);
    }

    @Test
    public void testCalculateSolarPosition_GeolocationWithNoArguments() {
        ZonedDateTime date = mock(ZonedDateTime.class);
        double latitude = 30.0;
        double longitude = -100.0;

        when(date.toZone(ZoneOffset.ofHours(-5))).thenReturn(ZoneOffset.ofHours(12));
        Grena3.calculateSolarPosition();
    }

    @Test
    public void testCalculateSolarPosition_SingleArgument() {
        ZonedDateTime date = mock(ZonedDateTime.class);
        double latitude = 30.0;
        double longitude = -100.0;

        when(date.toZone(ZoneOffset.ofHours(-5))).thenReturn(ZoneOffset.ofHours(12));
        Grena3.calculateSolarPosition(latitude, longitude);

        verify(date, times(1)).toZone(ZoneOffset.ofHours(12));
    }

    @Test
    public void testCalculateSolarPosition_SingleArgumentWithNull() {
        ZonedDateTime date = mock(ZonedDateTime.class);
        double latitude = 30.0;
        double longitude = -100.0;

        when(date.toZone(ZoneOffset.ofHours(-5))).thenReturn(ZoneOffset.ofHours(12));
        Grena3.calculateSolarPosition(null, longitude);

        verifyZeroMethods();
    }

    @Test
    public void testCalculateSolarPosition_SingleArgumentWithInvalidLongitude() {
        ZonedDateTime date = mock(ZonedDateTime.class);
        double latitude = 30.0;
        double longitude = -110.0;

        when(date.toZone(ZoneOffset.ofHours(-5))).thenReturn(ZoneOffset.ofHours(12));
        Grena3.calculateSolarPosition(latitude, longitude);

        verifyZeroMethods();
    }

    @Test
    public void testCalculateSolarPosition_SingleArgumentWithNegativeLongitude() {
        ZonedDateTime date = mock(ZonedDateTime.class);
        double latitude = 30.0;
        double longitude = -110.0;

        when(date.toZone(ZoneOffset.ofHours(-5))).thenReturn(ZoneOffset.ofHours(12));
        Grena3.calculateSolarPosition(latitude, longitude);

        verifyZeroMethods();
    }

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