package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEstimateRecentFutureDateTest {

    @Test
    public void estimateRecentFutureDateTest() {
        LocalDate date = LocalDate.of(2030, 1, 1);
        double delta = DeltaT.estimate(date);

        assertTrue(delta > 0);
    }

}