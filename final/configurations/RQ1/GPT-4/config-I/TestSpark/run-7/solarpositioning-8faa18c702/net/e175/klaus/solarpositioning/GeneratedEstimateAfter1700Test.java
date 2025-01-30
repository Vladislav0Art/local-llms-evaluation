package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class GeneratedEstimateAfter1700Test {

    @Test
    public void estimateAfter1700Test() {
        LocalDate date = LocalDate.of(1701, 1, 1);
        double estimate = DeltaT.estimate(date);
        double expected = 8.83 + 0.1603 * (decimalYear(date) - 1700) - 0.0059285 * Math.pow((decimalYear(date) - 1700), 2) + 0.00013336 * Math.pow((decimalYear(date) - 1700), 3) - Math.pow((decimalYear(date) - 1700), 4) / 1174000;
        assertEquals("Check estimate for year after 1700", expected, estimate, 0.001);
    }

}