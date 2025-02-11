package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.mockito.Mockito;

public class GeneratedEstimate_1970sYear_ReturnsExpectedDeltaT {

    @Test
    public void estimate_1970sYear_ReturnsExpectedDeltaT() {
        LocalDate forDate = LocalDate.of(1970, 1, 1);
        double expectedDeltaT = 45.45;
        assertEquals(expectedDeltaT, DeltaT.estimate(forDate));
    }

}