package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.mockito.Mockito;

public class GeneratedEstimate_2000sYear_ReturnsExpectedDeltaT {

    @Test
    public void estimate_2000sYear_ReturnsExpectedDeltaT() {
        LocalDate forDate = LocalDate.of(2000, 1, 1);
        double expectedDeltaT = 63.86;
        assertEquals(expectedDeltaT, DeltaT.estimate(forDate));
    }

}