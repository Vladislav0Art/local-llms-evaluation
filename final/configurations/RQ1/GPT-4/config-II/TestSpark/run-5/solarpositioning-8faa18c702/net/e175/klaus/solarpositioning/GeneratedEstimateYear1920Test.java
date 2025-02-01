package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEstimateYear1920Test {

    @Test
    public void estimateYear1920Test() {
        LocalDate localDate = LocalDate.of(1920, 5, 20);
        double expected = 20.401;
        double actual = DeltaT.estimate(localDate);
        assertEquals(expected, actual, 0.001);
    }

}