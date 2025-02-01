package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEstimateYear1600Test {

    @Test
    public void estimateYear1600Test() {
        LocalDate localDate = LocalDate.of(1600, 5, 20);
        double expected = 8.25;
        double actual = DeltaT.estimate(localDate);
        assertEquals(expected, actual, 0.001);
    }

}