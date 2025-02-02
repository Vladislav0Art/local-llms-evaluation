package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class GeneratedEstimateDeltaT_YearAfter1800ButBefore2005 {

    @Test
    public void EstimateDeltaT_YearAfter1800ButBefore2005() {
        final LocalDate forDate = LocalDate.of(2014, 1, 1);
        double deltaT = DeltaT.estimate(forDate);
        assertEquals(63.86 + 0.3345 * (forDate.getYear() - 2000) - 0.060374 * pow((forDate.getYear() - 2000), 2)
                        + 0.0017275 * pow((forDate.getYear() - 2000), 3) + 0.000651814 * pow((forDate.getYear() - 2000), 4)
                        + 0.00002373599 * pow((forDate.getYear() - 2000), 5),
                deltaT, 0.001);
    }

}