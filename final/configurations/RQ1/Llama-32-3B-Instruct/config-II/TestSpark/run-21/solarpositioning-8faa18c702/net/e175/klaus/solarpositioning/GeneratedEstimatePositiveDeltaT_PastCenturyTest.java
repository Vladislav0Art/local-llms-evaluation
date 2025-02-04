package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimatePositiveDeltaT_PastCenturyTest {

    @Test
    public void estimatePositiveDeltaT_PastCenturyTest() {
        LocalDate date = LocalDate.of(2004, 1, 1);
        double result = DeltaT.estimate(date);
        assertEquals(62.92 + 0.32217 * (date.getYear() - 2000), result, 0.00001);
    }

}