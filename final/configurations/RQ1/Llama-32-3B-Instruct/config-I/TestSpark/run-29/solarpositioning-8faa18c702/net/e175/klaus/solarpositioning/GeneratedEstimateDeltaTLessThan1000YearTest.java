package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateDeltaTLessThan1000YearTest {

    @Test
    public void estimateDeltaTLessThan1000YearTest() {
        LocalDate forDate = LocalDate.of(1027, 1, 1);
        double result = DeltaT.estimate(forDate);
        assertEquals(-20 + 32 * pow(3.27, 2), result, 0.00001);
    }

}