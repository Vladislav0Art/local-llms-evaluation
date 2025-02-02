package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateDeltaTLessThan1800YearTest {

    @Test
    public void estimateDeltaTLessThan1800YearTest() {
        LocalDate forDate = LocalDate.of(1700, 1, 1);
        double result = DeltaT.estimate(forDate);
        assertEquals(8.83 + 0.1603 * -0.67 - pow(-0.67, 2) / 7129, result, 0.00001);
    }

}