package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class GeneratedEstimateAfter1600Test {

    @Test
    public void estimateAfter1600Test() {
        LocalDate date = LocalDate.of(1601, 1, 1);
        double estimate = DeltaT.estimate(date);
        double expected = 120 - 0.9808 * decimalYear(date) - 0.01532 * Math.pow(decimalYear(date), 2) + Math.pow(decimalYear(date), 3) / 7129;
        assertEquals("Check estimate for year after 1600", expected, estimate, 0.001);
    }

}