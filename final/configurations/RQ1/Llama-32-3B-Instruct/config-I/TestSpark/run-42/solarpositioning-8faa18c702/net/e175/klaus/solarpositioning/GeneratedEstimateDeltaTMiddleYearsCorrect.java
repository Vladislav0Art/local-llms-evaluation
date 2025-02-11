package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class GeneratedEstimateDeltaTMiddleYearsCorrect {

    @Test
    public void estimateDeltaTMiddleYearsCorrect() {
        LocalDate forDate = LocalDate.of(1900, 1, 1);
        double result = net.e175.klaus.solarpositioning.DeltaT.estimate(forDate);
        assertEquals(-2.7900000000000005, result, 0.00001);
    }

}