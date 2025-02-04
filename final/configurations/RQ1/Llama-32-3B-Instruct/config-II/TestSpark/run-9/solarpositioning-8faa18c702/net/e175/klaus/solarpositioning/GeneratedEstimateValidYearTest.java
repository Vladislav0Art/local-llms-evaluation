package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateValidYearTest {

    @Test
    public void estimateValidYearTest() {
        LocalDate forDate = LocalDate.of(2000, 1, 1);
        double expectedDeltaT = 63.86;
        double actualDeltaT = DeltaT.estimate(forDate);
        assertEquals(expectedDeltaT, actualDeltaT);
    }

}