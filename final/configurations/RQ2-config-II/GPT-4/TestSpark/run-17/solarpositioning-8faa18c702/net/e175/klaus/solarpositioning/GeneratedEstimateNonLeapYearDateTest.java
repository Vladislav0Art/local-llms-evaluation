package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEstimateNonLeapYearDateTest {

    @Test
    public void estimateNonLeapYearDateTest() {
        LocalDate date = LocalDate.of(2003, 2, 28);
        double delta = DeltaT.estimate(date);

        assertTrue(delta > 0);
    }

}