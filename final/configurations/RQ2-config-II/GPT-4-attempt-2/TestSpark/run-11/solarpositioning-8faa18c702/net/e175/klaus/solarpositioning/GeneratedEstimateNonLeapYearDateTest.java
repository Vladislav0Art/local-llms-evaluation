package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEstimateNonLeapYearDateTest {

    @Test
    public void estimateNonLeapYearDateTest() {
        LocalDate forDate = LocalDate.of(2021, 3, 1);
        double estimatedDeltaT = DeltaT.estimate(forDate);

        assertEquals(71.25, estimatedDeltaT, 0.01);
    }

}