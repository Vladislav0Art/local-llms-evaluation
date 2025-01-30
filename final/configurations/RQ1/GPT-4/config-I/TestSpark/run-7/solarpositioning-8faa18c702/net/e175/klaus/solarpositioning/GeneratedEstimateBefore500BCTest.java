package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class GeneratedEstimateBefore500BCTest {

    @Test
    public void estimateBefore500BCTest() {
        LocalDate date = LocalDate.of(-501, 1, 1);
        double estimate = DeltaT.estimate(date);
        double expected = -20 + 32 * Math.pow(((decimalYear(date) - 1820) / 100), 2);

        assertEquals("Check estimate for year before -500", expected, estimate, 0.0001);
    }

}