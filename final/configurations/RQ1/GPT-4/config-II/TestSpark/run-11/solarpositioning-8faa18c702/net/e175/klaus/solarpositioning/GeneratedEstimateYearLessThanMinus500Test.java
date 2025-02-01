package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateYearLessThanMinus500Test {

    @Test
    public void estimateYearLessThanMinus500Test() {
        final double deltaT = DeltaT.estimate(LocalDate.of(-500, 10, 31));
        assertEquals(-685.0, deltaT, 0.01);
    }

}