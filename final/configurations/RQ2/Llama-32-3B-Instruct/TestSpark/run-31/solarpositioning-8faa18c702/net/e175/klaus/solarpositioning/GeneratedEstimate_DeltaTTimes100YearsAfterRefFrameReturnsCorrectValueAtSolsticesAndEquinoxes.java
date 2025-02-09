package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class GeneratedEstimate_DeltaTTimes100YearsAfterRefFrameReturnsCorrectValueAtSolsticesAndEquinoxes {

    @Test
    public void estimate_DeltaTTimes100YearsAfterRefFrameReturnsCorrectValueAtSolsticesAndEquinoxes() {
        LocalDate forDate = LocalDate.of(2020, 12, 21)
                .plusYears(100)
                .minusDays(30); // Winter Solstice (Dec 21/22) at epoch, adjusted by Julian-Date correction
        double expectedDeltaT = pow(24, 2) / (pow(365.25, 2));
        assertEquals(expectedDeltaT, DeltaT.estimate(forDate), 1e-6);

        forDate = LocalDate.of(2020, 3, 20)
                .plusYears(100)
                .minusDays(30); // Spring Equinox (Mar 20/21) at epoch, adjusted by Julian-Date correction
        assertEquals(expectedDeltaT, DeltaT.estimate(forDate), 1e-6);

        forDate = LocalDate.of(2020, 6, 20)
                .plusYears(100)
                .minusDays(30); // Summer Solstice (Jun 20/21) at epoch, adjusted by Julian-Date correction
        assertEquals(expectedDeltaT, DeltaT.estimate(forDate), 1e-6);
    }

}