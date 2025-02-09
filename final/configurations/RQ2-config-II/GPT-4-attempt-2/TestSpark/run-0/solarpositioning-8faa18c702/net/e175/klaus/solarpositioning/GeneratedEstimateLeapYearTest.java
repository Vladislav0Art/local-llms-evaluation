package net.e175.klaus.solarpositioning;

import org.junit.Test;
import net.e175.klaus.solarpositioning.DeltaT;

import static junit.framework.TestCase.assertEquals;

public class GeneratedEstimateLeapYearTest {

    @Test
    public void estimateLeapYearTest() {
        LocalDate date = LocalDate.of(2020, 1, 1);
        double result = DeltaT.estimate(date);
        assertEquals(69.57, result, 0.01);
    }

}