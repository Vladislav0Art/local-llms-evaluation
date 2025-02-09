package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class GeneratedEstimate_DeltaTForCommonYearReturnsExpectedValueAtSolsticesAndEquinoxes {

    @Test
    public void estimate_DeltaTForCommonYearReturnsExpectedValueAtSolsticesAndEquinoxes() {
        LocalDate forDate = LocalDate.of(2020, 12, 21); // Winter Solstice (Dec 21/22)
        double expectedDeltaT = pow(24, 2) / (pow(365.25, 2));
        assertEquals(expectedDeltaT, DeltaT.estimate(forDate), 1e-6);

        forDate = LocalDate.of(2020, 3, 20); // Spring Equinox (Mar 20/21)
        assertEquals(expectedDeltaT, DeltaT.estimate(forDate), 1e-6);

        forDate = LocalDate.of(2020, 6, 20); // Summer Solstice (Jun 20/21)
        assertEquals(expectedDeltaT, DeltaT.estimate(forDate), 1e-6);
    }

}