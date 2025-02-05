package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEstimateRecentPastDateTest {

    @Test
    public void estimateRecentPastDateTest() {
        LocalDate date = LocalDate.of(2000, 1, 1);
        double delta = DeltaT.estimate(date);

        assertTrue(delta > 0);
    }

}