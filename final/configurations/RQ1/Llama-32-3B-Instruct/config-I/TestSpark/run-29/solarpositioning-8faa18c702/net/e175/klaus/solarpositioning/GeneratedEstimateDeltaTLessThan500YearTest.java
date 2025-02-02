package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateDeltaTLessThan500YearTest {

    @Test
    public void estimateDeltaTLessThan500YearTest() {
        LocalDate forDate = LocalDate.of(1820, 1, 1);
        double result = DeltaT.estimate(forDate);
        assertEquals(-20 + 32 * pow(0.18, 2), result, 0.00001);
    }

}