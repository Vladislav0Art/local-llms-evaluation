package net.e175.klaus.solarpositioning;

import org.junit.Test;
import net.e175.klaus.solarpositioning.DeltaT;

import static junit.framework.TestCase.assertEquals;

public class GeneratedEstimateMonthChangeTest {

    @Test
    public void estimateMonthChangeTest() {
        LocalDate date = LocalDate.of(2019, 12, 31);
        double result = DeltaT.estimate(date);
        assertEquals(69.24, result, 0.01);
    }

}