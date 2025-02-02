package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimate_DeltaTForPastYears_ReturnsApproximateValues {

    @Test
    public void estimate_DeltaTForPastYears_ReturnsApproximateValues() {
        LocalDate forDate = LocalDate.of(1800, 1, 1);
        double estimatedDeltaT = DeltaT.estimate(forDate);
        assertEquals(13.72, estimatedDeltaT, 1e-6);
    }

}