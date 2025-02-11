package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedEstimateDeltaT_forDateLessThan_500Test {

    @Test
    public void estimateDeltaT_forDateLessThan_500Test() {
        when(DeltaT.decimalYear(Mockito.any(LocalDate.class))).thenReturn(400);
        assertEquals(-1.0, DeltaT.estimate(Mockito.any(LocalDate.class)), 0.01);
    }

}