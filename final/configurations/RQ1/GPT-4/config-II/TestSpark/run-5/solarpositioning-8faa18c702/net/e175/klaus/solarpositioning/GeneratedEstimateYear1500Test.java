package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEstimateYear1500Test {

    @Test
    public void estimateYear1500Test() {
        LocalDate localDate = LocalDate.of(1500, 5, 20);
        double expected = 97.411;
        double actual = DeltaT.estimate(localDate);
        assertEquals(expected, actual, 0.001);
    }

}