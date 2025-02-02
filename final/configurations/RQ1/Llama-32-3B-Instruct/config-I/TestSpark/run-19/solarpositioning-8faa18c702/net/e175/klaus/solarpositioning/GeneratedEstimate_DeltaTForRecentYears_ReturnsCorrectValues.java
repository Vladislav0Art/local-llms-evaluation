package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimate_DeltaTForRecentYears_ReturnsCorrectValues {

    @Test
    public void estimate_DeltaTForRecentYears_ReturnsCorrectValues() {
        LocalDate forDate = LocalDate.of(2000, 1, 1);
        double estimatedDeltaT = DeltaT.estimate(forDate);
        assertEquals(63.86, estimatedDeltaT, 1e-6);
    }

}