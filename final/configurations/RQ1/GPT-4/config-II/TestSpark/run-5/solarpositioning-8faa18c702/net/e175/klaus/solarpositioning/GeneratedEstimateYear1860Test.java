package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEstimateYear1860Test {

    @Test
    public void estimateYear1860Test() {
        LocalDate localDate = LocalDate.of(1860, 5, 20);
        double expected = 7.620;
        double actual = DeltaT.estimate(localDate);
        assertEquals(expected, actual, 0.001);
    }

}