package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.mockito.Mockito;

public class GeneratedEstimate_2020sYear_ReturnsExpectedDeltaT {

    @Test
    public void estimate_2020sYear_ReturnsExpectedDeltaT() {
        LocalDate forDate = LocalDate.of(2025, 1, 1);
        double expectedDeltaT = 73.87;
        assertEquals(expectedDeltaT, DeltaT.estimate(forDate));
    }

}