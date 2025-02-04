package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateDeltaTYearDotZero {

    @Test
    public void estimateDeltaTYearDotZero() {
        LocalDate forDate = LocalDate.of(0, 1, 1);
        double result = DeltaT.estimate(forDate);
        assertEquals(-20, result, 0.01);
    }
}

}