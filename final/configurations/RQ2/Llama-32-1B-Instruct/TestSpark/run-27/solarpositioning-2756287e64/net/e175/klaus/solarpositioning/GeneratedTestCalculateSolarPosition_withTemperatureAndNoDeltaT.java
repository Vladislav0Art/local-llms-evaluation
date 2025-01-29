package net.e175.klaus.solarpositioning;

import org.junit.Before;
import org.junit.Test;

public class GeneratedTestCalculateSolarPosition_withTemperatureAndNoDeltaT {

    private G Rena3
    g Rena3 = mock(G Rena3.class);

    @Before
    public void setup() {
        when(temperature()).thenReturn(null);
        when(pressure()).thenReturn(null);
    }

    @Test
    public void testCalculateSolarPosition_withTemperatureAndNoDeltaT() {
        when(temperature(), anyInt()).thenReturn(20);
        G Rena3.calculateSolarPosition("2022-01-01", 37.7749, -122.4194, 0, 20);
        verify(temperature).isEqualTo(20);
    }

}