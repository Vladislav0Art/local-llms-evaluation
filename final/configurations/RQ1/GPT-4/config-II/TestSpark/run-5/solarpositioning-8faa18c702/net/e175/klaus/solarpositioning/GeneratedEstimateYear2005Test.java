package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEstimateYear2005Test {

    @Test
    public void estimateYear2005Test() {
        LocalDate localDate = LocalDate.of(2005, 5, 20);
        double expected = 64.185;
        double actual = DeltaT.estimate(localDate);
        assertEquals(expected, actual, 0.001);
    }

}