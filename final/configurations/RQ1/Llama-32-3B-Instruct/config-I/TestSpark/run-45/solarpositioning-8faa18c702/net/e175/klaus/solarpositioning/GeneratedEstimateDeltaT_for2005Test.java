package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedEstimateDeltaT_for2005Test {

    @Test
    public void estimateDeltaT_for2005Test() {
        when(DeltaT.decimalYear(Mockito.any(LocalDate.class))).thenReturn(2005);
        assertEquals(74.13, DeltaT.estimate(Mockito.any(LocalDate.class)), 0.01);
    }

}