package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEstimateYearLessThanMinus500Test {

    @Test
    public void estimateYearLessThanMinus500Test() {
        assertEquals(-759.84, DeltaT.estimate(LocalDate.of(-1000, 1, 1)), 0.001);
    }

}