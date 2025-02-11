package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedEstimate_SecularAccelerationForDeltaTMid2000s {

    @Test
    public void estimate_SecularAccelerationForDeltaTMid2000s() {
        when(DeltaT.decimalYear(Mockito.mock(LocalDate.class))).thenReturn(2010);
        assertEquals(61.96, DeltaT.estimate(Mockito.mock(LocalDate.class)), 0.01);
    }

}