package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import net.e175.klaus.solarpositioning.DeltaT;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class GeneratedEstimateInLeapYearTest {

    private static final double DELTA = 1e-15;

    @Test
    public void estimateInLeapYearTest() {
        LocalDate date = LocalDate.of(2004, 2, 29);
        double estimatedDeltaT = DeltaT.estimate(date);
        // expected value here is a placeholder, replace with actual expected value
        assertEquals(1234.567, estimatedDeltaT, DELTA);
    }

}