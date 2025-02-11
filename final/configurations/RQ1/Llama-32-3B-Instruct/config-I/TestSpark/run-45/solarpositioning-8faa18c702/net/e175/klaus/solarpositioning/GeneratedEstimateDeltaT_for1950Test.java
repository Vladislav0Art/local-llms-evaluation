package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedEstimateDeltaT_for1950Test {

    @Test
    public void estimateDeltaT_for1950Test() {
        when(DeltaT.decimalYear(Mockito.any(LocalDate.class))).thenReturn(1950);
        assertEquals(29.07, DeltaT.estimate(Mockito.any(LocalDate.class)), 0.01);
    }

}