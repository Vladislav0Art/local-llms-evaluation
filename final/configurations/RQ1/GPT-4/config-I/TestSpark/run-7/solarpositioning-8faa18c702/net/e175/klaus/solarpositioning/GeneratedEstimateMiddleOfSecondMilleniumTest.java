package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class GeneratedEstimateMiddleOfSecondMilleniumTest {

    @Test
    public void estimateMiddleOfSecondMilleniumTest() {
        LocalDate date = LocalDate.of(1600, 1, 1);
        double estimate = DeltaT.estimate(date);
        double expected = 120;
        assertEquals("Incorrect estimate for year 1600", expected, estimate, 0.001);
    }

}