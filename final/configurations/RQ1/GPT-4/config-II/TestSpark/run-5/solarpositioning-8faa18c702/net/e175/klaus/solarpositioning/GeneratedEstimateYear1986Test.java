package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEstimateYear1986Test {

    @Test
    public void estimateYear1986Test() {
        LocalDate localDate = LocalDate.of(1986, 5, 20);
        double expected = 54.254;
        double actual = DeltaT.estimate(localDate);
        assertEquals(expected, actual, 0.001);
    }

}