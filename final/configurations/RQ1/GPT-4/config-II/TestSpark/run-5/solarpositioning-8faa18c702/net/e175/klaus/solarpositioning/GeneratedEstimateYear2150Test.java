package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEstimateYear2150Test {

    @Test
    public void estimateYear2150Test() {
        LocalDate localDate = LocalDate.of(2150, 5, 20);
        double expected = 27.82;
        double actual = DeltaT.estimate(localDate);
        assertEquals(expected, actual, 0.001);
    }

}