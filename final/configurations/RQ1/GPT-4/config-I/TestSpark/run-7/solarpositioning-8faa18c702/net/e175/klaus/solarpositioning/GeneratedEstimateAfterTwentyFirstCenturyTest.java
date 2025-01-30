package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class GeneratedEstimateAfterTwentyFirstCenturyTest {

    @Test
    public void estimateAfterTwentyFirstCenturyTest() {
        LocalDate date = LocalDate.of(2150, 1, 1);
        double estimate = DeltaT.estimate(date);
        double expected = -20;
        assertEquals("Incorrect estimate for year 2150", expected, estimate, 0.001);
    }

}