package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEstimateYear1700Test {

    @Test
    public void estimateYear1700Test() {
        LocalDate localDate = LocalDate.of(1700, 5, 20);
        double expected = 13.210;
        double actual = DeltaT.estimate(localDate);
        assertEquals(expected, actual, 0.001);
    }

}