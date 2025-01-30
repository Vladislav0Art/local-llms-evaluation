package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class GeneratedEstimateBefore0Test {

    @Test
    public void estimateBefore0Test() {
        LocalDate date = LocalDate.of(0, 1, 1);
        double estimate = DeltaT.estimate(date);
        assertEquals("Check estimate for year 0", 10583.6, estimate, 0.0001);
    }

}