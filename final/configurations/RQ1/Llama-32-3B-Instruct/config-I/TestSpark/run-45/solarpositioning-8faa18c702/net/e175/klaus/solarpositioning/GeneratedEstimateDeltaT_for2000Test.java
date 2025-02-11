package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedEstimateDeltaT_for2000Test {

    @Test
    public void estimateDeltaT_for2000Test() {
        when(DeltaT.decimalYear(Mockito.any(LocalDate.class))).thenReturn(2000);
        assertEquals(63.86, DeltaT.estimate(Mockito.any(LocalDate.class)), 0.01);
    }

}