package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.mockito.Mockito;

public class GeneratedEstimate_2010sYear_ReturnsExpectedDeltaT {

    @Test
    public void estimate_2010sYear_ReturnsExpectedDeltaT() {
        LocalDate forDate = LocalDate.of(2015, 1, 1);
        double expectedDeltaT = 69.02;
        assertEquals(expectedDeltaT, DeltaT.estimate(forDate));
    }

}