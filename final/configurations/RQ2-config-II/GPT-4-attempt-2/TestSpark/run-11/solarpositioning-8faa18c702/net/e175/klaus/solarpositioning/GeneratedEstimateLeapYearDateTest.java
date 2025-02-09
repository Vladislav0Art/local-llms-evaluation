package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEstimateLeapYearDateTest {

    @Test
    public void estimateLeapYearDateTest() {
        LocalDate forDate = LocalDate.of(2020, 2, 29);
        double estimatedDeltaT = DeltaT.estimate(forDate);

        assertEquals(70.66, estimatedDeltaT, 0.01);
    }

}