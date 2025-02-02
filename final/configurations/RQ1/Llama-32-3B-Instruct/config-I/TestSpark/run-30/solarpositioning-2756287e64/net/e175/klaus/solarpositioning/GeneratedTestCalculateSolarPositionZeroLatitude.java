package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.ZonedDateTime;

import static org.mockito.Mockito.*;

import org.mockito.MockitoAnnotations;

public class GeneratedTestCalculateSolarPositionZeroLatitude {

    @Mock
    private AzimuthZenithAngle azimuthZenithAngle;

    @Mock
    private ZoneOffset zoneOffset;

    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testCalculateSolarPositionZeroLatitude() {
        setup();
        ZonedDateTime date = ZonedDateTime.now();
        double longitude = 0;
        double deltaT = 0;
        Grena3 grena3 = new Grena3();

        when(zoneOffset.getTotalSeconds()).thenReturn(0);
        when(date.withZoneSameInstant(zoneOffset)).thenReturn(date);

        AzimuthZenithAngle result = grena3.calculateSolarPosition(date, longitude, deltaT);

        assertEquals(azimuthZenithAngle, result);
    }

}