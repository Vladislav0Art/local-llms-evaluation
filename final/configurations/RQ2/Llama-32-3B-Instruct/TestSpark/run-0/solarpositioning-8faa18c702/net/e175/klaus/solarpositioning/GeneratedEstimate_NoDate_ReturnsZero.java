package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.any;

public class GeneratedEstimate_NoDate_ReturnsZero {

    @Mock
    private DeltaT deltaT;

    @Test
    public void estimate_NoDate_ReturnsZero() {
        when(deltaT.estimate(null)).thenReturn(0d);
        assertEquals(0d, deltaT.estimate(null));
    }

}