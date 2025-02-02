package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateDeltaTLowYearsLessThan500Test {

    @Test
    public void estimateDeltaTLowYearsLessThan500Test() {
        LocalDate date = LocalDate.of(-600, 1, 1);
        double deltaT = DeltaT.estimate(date);
        assertEquals(15.2, deltaT, 0.01);
    }

}