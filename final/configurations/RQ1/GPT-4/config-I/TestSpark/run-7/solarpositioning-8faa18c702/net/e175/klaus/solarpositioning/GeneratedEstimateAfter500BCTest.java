package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class GeneratedEstimateAfter500BCTest {

    @Test
    public void estimateAfter500BCTest() {
        LocalDate date = LocalDate.of(-500, 1, 1);
        double estimate = DeltaT.estimate(date);
        double expected = 10583.6;
        assertEquals("Incorrect estimate for year -500", expected, estimate, 0.001);
    }

}