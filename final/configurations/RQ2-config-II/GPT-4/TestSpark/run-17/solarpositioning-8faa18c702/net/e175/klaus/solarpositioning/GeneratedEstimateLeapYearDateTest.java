package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEstimateLeapYearDateTest {

    @Test
    public void estimateLeapYearDateTest() {
        LocalDate date = LocalDate.of(2004, 2, 29);
        double delta = DeltaT.estimate(date);

        assertTrue(delta > 0);
    }

}