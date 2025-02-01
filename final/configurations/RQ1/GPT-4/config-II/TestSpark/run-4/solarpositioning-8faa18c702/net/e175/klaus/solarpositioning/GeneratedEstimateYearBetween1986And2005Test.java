package net.e175.klaus.solarpositioning;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateYearBetween1986And2005Test {

    @Test
    public void estimateYearBetween1986And2005Test() {
        LocalDate date = LocalDate.of(2000, 6, 1);
        double deltaT = DeltaT.estimate(date);
        assertEquals(63.83, deltaT, 0.01);
    }

}