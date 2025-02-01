package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEstimateNegativeYearTest {

    @Test
    public void estimateNegativeYearTest() {
        LocalDate localDate = LocalDate.of(-500, 5, 20);
        double expected = -58.64;
        double actual = DeltaT.estimate(localDate);
        assertEquals(expected, actual, 0.001);
    }

}