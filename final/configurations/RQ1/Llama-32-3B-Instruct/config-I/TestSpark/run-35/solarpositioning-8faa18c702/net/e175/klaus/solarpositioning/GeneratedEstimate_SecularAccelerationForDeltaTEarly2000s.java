package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedEstimate_SecularAccelerationForDeltaTEarly2000s {

    @Test
    public void estimate_SecularAccelerationForDeltaTEarly2000s() {
        when(DeltaT.decimalYear(Mockito.mock(LocalDate.class))).thenReturn(2005);
        assertEquals(63.86, DeltaT.estimate(Mockito.mock(LocalDate.class)), 0.01);
    }

}