package net.e175.klaus.solarpositioning;

import org.junit.Before;
import org.junit.Test;

public class GeneratedTestCalculateSolarPosition_withDeltaT {

    private G Rena3
    g Rena3 = mock(G Rena3.class);

    @Before
    public void setup() {
        when(temperature()).thenReturn(null);
        when(pressure()).thenReturn(null);
    }

    @Test
    public void testCalculateSolarPosition_withDeltaT() {
        when(pressure(), anyInt()).thenReturn(null);
        G Rena3.calculateSolarPosition("2022-01-01", 37.7749, -122.4194, 0, 1);
        verify(pressure).isnull();
    }

}