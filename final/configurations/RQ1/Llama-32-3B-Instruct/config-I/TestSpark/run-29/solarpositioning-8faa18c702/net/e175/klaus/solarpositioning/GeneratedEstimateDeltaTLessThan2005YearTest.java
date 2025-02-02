package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateDeltaTLessThan2005YearTest {

    @Test
    public void estimateDeltaTLessThan2005YearTest() {
        LocalDate forDate = LocalDate.of(1999, 1, 1);
        double result = DeltaT.estimate(forDate);
        assertEquals(63.86 + 0.3345 * -0.99 - pow(-0.99, 2) / 360000 + 0.000651814 * pow(-0.99, 4), result, 0.00001);
    }

}