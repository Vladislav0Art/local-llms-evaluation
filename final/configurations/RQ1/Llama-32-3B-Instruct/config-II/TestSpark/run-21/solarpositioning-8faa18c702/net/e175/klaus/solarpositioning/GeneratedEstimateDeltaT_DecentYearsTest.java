package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateDeltaT_DecentYearsTest {

    @Test
    public void estimateDeltaT_DecentYearsTest() {
        LocalDate date = LocalDate.of(-3000, 1, 1);
        double result = DeltaT.estimate(date);
        assertEquals(62.92 + 0.32217 * (-3000), result, 0.00001);
    }

}