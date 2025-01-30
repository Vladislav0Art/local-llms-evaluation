package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class GeneratedEstimateAfter0Test {

    @Test
    public void estimateAfter0Test() {
        LocalDate date = LocalDate.of(500, 1, 1);
        double estimate = DeltaT.estimate(date);
        double expected = 1574.2 - 556.01 * (decimalYear(date) / 100)
                + 71.23472 * Math.pow((decimalYear(date) / 100), 2) + 0.319781 * Math.pow((decimalYear(date) / 100), 3)
                - 0.8503463 * Math.pow((decimalYear(date) / 100), 4)
                - 0.005050998 * Math.pow((decimalYear(date) / 100), 5) + 0.0083572073 * Math.pow((decimalYear(date) / 100), 6);
        assertEquals(expected, estimate, 0.0001);
    }

}