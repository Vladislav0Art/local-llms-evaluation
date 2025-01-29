package net.e175.klaus.solarpositioning;

import org.junit.Before;
import org.junit.Test;

public class GeneratedTestCalculateSolarPosition_noPressure {

    private G Rena3
    g Rena3 = mock(G Rena3.class);

    @Before
    public void setup() {
        when(temperature()).thenReturn(null);
        when(pressure()).thenReturn(null);
    }

    @Test
    public void testCalculateSolarPosition_noPressure() {
        verify(pressure, never()).isnull();
    }

}