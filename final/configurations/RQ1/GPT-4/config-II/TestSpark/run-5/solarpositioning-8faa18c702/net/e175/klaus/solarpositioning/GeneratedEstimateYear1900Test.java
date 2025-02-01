package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEstimateYear1900Test {

    @Test
    public void estimateYear1900Test() {
        LocalDate localDate = LocalDate.of(1900, 5, 20);
        double expected = -3.863;
        double actual = DeltaT.estimate(localDate);
        assertEquals(expected, actual, 0.001);
    }

}