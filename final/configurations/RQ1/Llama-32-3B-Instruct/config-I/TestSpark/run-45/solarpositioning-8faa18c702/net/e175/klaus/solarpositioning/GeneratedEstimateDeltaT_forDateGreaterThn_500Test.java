package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedEstimateDeltaT_forDateGreaterThn_500Test {

    @Test
    public void estimateDeltaT_forDateGreaterThn_500Test() {
        when(DeltaT.decimalYear(Mockito.any(LocalDate.class))).thenReturn(1500);
        assertEquals(19.88, DeltaT.estimate(Mockito.any.LocalDate.class), 0.01);
    }

}