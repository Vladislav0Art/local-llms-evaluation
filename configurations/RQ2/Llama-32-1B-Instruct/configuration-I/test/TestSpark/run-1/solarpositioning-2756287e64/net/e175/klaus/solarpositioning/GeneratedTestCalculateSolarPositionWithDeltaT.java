package net.e175.klaus.solarpositioning;

import org.junit.Before;
import org.junit.Test;

import java.time.ZonedDateTime;
import java.util.Random;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTestCalculateSolarPositionWithDeltaT {

    private final Mockito mock = new Mockito();
    private double latitude = 10;
    private double longitude = 20;

    @Before
    public void setup() {
        // No setup needed, just mocking the interface.
    }

    @Test
    public void testCalculateSolarPositionWithDeltaT() throws Exception {
        ZonedDateTime date = mock(ZonedDateTime.class);
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude);

        verifyMockedClass(ZonedDateTime.class);
        when(date.toEpochSecond()).thenReturn(1643723400000L);
    }

}