package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateDeltaTLessThan1900YearTest {

    @Test
    public void estimateDeltaTLessThan1900YearTest() {
        LocalDate forDate = LocalDate.of(1895, 1, 1);
        double result = DeltaT.estimate(forDate);
        assertEquals(-2.79 + 1.494119 * -0.85 - pow(-0.85, 2) / 10000, result, 0.00001);
    }

}