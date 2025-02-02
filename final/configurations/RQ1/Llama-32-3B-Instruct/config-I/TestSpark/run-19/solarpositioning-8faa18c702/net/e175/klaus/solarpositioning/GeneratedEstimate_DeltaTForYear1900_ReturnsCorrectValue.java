package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimate_DeltaTForYear1900_ReturnsCorrectValue {

    @Test
    public void estimate_DeltaTForYear1900_ReturnsCorrectValue() {
        LocalDate forDate = LocalDate.of(1900, 1, 1);
        double estimatedDeltaT = DeltaT.estimate(forDate);
        assertEquals(7.62, estimatedDeltaT, 1e-6);
    }

}