package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class GeneratedEstimateAfter2150Test {

    @Test
    public void estimateAfter2150Test() {
        LocalDate date = LocalDate.of(2151, 1, 1);
        double estimate = DeltaT.estimate(date);
        double expected = -20 + 32 * Math.pow((decimalYear(date) - 1820) / 100, 2);
        assertEquals("Check estimate for years after 2150", expected, estimate, 0.001);
    }

    private double decimalYear(LocalDate date) {
        return date.getYear() + (date.getMonthValue() - 0.5) / 12;
    }

}