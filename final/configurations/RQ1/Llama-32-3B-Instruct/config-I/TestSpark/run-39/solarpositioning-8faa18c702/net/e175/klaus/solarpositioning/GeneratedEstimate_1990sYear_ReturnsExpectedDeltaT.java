package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.mockito.Mockito;

public class GeneratedEstimate_1990sYear_ReturnsExpectedDeltaT {

    @Test
    public void estimate_1990sYear_ReturnsExpectedDeltaT() {
        LocalDate forDate = LocalDate.of(1990, 1, 1);
        double expectedDeltaT = 73.83;
        assertEquals(expectedDeltaT, DeltaT.estimate(forDate));
    }

}