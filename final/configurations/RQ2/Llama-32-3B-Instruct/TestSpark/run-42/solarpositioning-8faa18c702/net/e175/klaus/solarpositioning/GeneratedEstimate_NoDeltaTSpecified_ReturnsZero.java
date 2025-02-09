package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.mockito.Mockito.when;

public class GeneratedEstimate_NoDeltaTSpecified_ReturnsZero {

    @Test
    public void estimate_NoDeltaTSpecified_ReturnsZero() {
        assertEquals(0.0, (double) DeltaT.estimate(LocalDate.of(2022, 6, 15)));
    }

}