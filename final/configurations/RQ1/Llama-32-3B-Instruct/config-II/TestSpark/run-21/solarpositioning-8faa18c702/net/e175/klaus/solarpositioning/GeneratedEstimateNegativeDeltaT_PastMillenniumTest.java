package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateNegativeDeltaT_PastMillenniumTest {

    @Test
    public void estimateNegativeDeltaT_PastMillenniumTest() {
        LocalDate date = LocalDate.of(-500, 1, 1);
        double result = DeltaT.estimate(date);
        assertEquals(62.92 + 0.32217 * (-600), result, 0.00001);
    }

}