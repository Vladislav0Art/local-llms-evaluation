package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.mockito.Mockito;

public class GeneratedEstimate_1960sYear_ReturnsExpectedDeltaT {

    @Test
    public void estimate_1960sYear_ReturnsExpectedDeltaT() {
        LocalDate forDate = LocalDate.of(1955, 1, 1);
        double expectedDeltaT = 29.07;
        assertEquals(expectedDeltaT, DeltaT.estimate(forDate));
    }

}