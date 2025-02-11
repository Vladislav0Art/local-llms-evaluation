package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedEstimate_DecadeDeltaTEarly1800s {

    @Test
    public void estimate_DecadeDeltaTEarly1800s() {
        when(DeltaT.decimalYear(Mockito.mock(LocalDate.class))).thenReturn(1815);
        assertEquals(8.83, DeltaT.estimate(Mockito.mock(LocalDate.class)), 0.01);
    }

}