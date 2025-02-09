package net.e175.klaus.solarpositioning;

import org.junit.Test;
import net.e175.klaus.solarpositioning.DeltaT;

import static junit.framework.TestCase.assertEquals;

public class GeneratedEstimateValidYearTest {

    @Test
    public void estimateValidYearTest() {
        LocalDate date = LocalDate.of(2000, 1, 1);
        double result = DeltaT.estimate(date);
        assertEquals(63.83, result, 0.01);
    }

}