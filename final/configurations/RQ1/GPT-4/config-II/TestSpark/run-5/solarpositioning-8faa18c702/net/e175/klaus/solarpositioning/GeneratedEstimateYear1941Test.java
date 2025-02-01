package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEstimateYear1941Test {

    @Test
    public void estimateYear1941Test() {
        LocalDate localDate = LocalDate.of(1941, 5, 20);
        double expected = 29.004;
        double actual = DeltaT.estimate(localDate);
        assertEquals(expected, actual, 0.001);
    }

}