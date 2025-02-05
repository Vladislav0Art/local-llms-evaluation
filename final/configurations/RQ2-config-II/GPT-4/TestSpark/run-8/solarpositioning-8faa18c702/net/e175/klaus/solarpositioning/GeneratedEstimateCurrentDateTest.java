package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEstimateCurrentDateTest {

    @Test
    public void estimateCurrentDateTest() {
        final LocalDate forDate = LocalDate.now();
        double result = DeltaT.estimate(forDate);
        assertNotNull("DeltaT estimate should be not null for the current date", result);
    }

}