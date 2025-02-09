package net.e175.klaus.solarpositioning;

import org.junit.Test;
import net.e175.klaus.solarpositioning.DeltaT;

import static junit.framework.TestCase.assertEquals;

public class GeneratedEstimateNonLeapYearTest {

    @Test
    public void estimateNonLeapYearTest() {
        LocalDate date = LocalDate.of(2019, 1, 1);
        double result = DeltaT.estimate(date);
        assertEquals(69.24, result, 0.01);
    }

}