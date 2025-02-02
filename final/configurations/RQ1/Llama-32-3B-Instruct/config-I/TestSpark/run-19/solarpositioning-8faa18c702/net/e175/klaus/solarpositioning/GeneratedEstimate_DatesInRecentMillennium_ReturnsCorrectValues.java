package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimate_DatesInRecentMillennium_ReturnsCorrectValues {

    @Test
    public void estimate_DatesInRecentMillennium_ReturnsCorrectValues() {
        LocalDate forDate = LocalDate.of(1000, 1, 1);
        double estimatedDeltaT = DeltaT.estimate(forDate);
        assertEquals(-20, estimatedDeltaT, 1e-6);
    }

}