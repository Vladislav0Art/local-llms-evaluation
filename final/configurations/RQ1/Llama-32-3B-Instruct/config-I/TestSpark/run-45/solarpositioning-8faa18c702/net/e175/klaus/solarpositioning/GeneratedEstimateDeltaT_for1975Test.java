package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedEstimateDeltaT_for1975Test {

    @Test
    public void estimateDeltaT_for1975Test() {
        when(DeltaT.decimalYear(Mockito.any(LocalDate.class))).thenReturn(1975);
        assertEquals(45.45, DeltaT.estimate(Mockito.any(LocalDate.class)), 0.01);
    }

}