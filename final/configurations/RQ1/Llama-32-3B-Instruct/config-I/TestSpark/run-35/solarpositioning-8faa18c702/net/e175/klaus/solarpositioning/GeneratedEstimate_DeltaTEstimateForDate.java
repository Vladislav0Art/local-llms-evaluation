package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedEstimate_DeltaTEstimateForDate {

    @Test
    public void estimate_DeltaTEstimateForDate() {
        when(DeltaT.decimalYear(Mockito.mock(LocalDate.class))).thenReturn(2000);
        assertEquals(62.92, DeltaT.estimate(Mockito.mock(LocalDate.class)), 0.01);
    }

}