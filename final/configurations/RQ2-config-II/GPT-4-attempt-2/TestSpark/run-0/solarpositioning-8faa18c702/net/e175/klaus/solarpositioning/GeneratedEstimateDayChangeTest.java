package net.e175.klaus.solarpositioning;

import org.junit.Test;
import net.e175.klaus.solarpositioning.DeltaT;

import static junit.framework.TestCase.assertEquals;

public class GeneratedEstimateDayChangeTest {

    @Test
    public void estimateDayChangeTest() {
        LocalDate date = LocalDate.of(2019, 1, 31);
        double result = DeltaT.estimate(date);
        assertEquals(69.24, result, 0.01);
    }

}