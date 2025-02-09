package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.mockito.Mockito.when;

public class GeneratedEstimate_DifferentDates_ReturnsDeltaT {

    @Test
    public void estimate_DifferentDates_ReturnsDeltaT() {
        when(DeltaT.estimate(any(LocalDate.class))).thenReturn(1.0);
        assertEquals(1.0, (double) DeltaT.estimate(LocalDate.of(2022, 6, 15)));
    }

}