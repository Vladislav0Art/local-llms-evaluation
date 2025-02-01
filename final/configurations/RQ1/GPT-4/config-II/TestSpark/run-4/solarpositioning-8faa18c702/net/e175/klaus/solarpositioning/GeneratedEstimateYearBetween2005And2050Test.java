package net.e175.klaus.solarpositioning;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateYearBetween2005And2050Test {

    @Test
    public void estimateYearBetween2005And2050Test() {
        LocalDate date = LocalDate.of(2030, 6, 1);
        double deltaT = DeltaT.estimate(date);
        assertEquals(66.93, deltaT, 0.01);
    }

}