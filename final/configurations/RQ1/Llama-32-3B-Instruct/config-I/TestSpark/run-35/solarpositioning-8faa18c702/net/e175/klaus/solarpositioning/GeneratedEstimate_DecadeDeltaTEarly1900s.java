package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedEstimate_DecadeDeltaTEarly1900s {

    @Test
    public void estimate_DecadeDeltaTEarly1900s() {
        when(DeltaT.decimalYear(Mockito.mock(LocalDate.class))).thenReturn(1915);
        assertEquals(-2.79, DeltaT.estimate(Mockito.mock(LocalDate.class)), 0.01);
    }

}