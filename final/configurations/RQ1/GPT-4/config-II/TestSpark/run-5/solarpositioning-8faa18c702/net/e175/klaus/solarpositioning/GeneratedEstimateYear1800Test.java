package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEstimateYear1800Test {

    @Test
    public void estimateYear1800Test() {
        LocalDate localDate = LocalDate.of(1800, 5, 20);
        double expected = 13.720;
        double actual = DeltaT.estimate(localDate);
        assertEquals(expected, actual, 0.001);
    }

}