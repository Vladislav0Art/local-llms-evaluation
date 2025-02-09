package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class GeneratedEstimate_DeltaTTimes100YearsAfterRefFrameReturnsCorrectValue {

    @Test
    public void estimate_DeltaTTimes100YearsAfterRefFrameReturnsCorrectValue() {
        LocalDate forDate = LocalDate.of(2020, 12, 31)
                .plusYears(100)
                .minusDays(30); // Delta T (T) at epoch, adjusted by Julian-Date correction
        double expectedDeltaT = pow(24, 2) / (pow(365.25, 2));
        assertEquals(expectedDeltaT, DeltaT.estimate(forDate), 1e-6);
    }

}