package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.mockito.Mockito.when;

public class GeneratedEstimate_SameDate_ReturnsZero {

    @Test
    public void estimate_SameDate_ReturnsZero() {
        when(DeltaT.estimate(any(LocalDate.class))).thenReturn(0.0);
        assertEquals(0.0, (double) DeltaT.estimate(LocalDate.of(2022, 6, 15)));
    }

}