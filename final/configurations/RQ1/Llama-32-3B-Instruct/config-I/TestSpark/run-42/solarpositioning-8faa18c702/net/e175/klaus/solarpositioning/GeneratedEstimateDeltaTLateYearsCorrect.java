package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class GeneratedEstimateDeltaTLateYearsCorrect {

    @Test
    public void estimateDeltaTLateYearsCorrect() {
        LocalDate forDate = LocalDate.of(2000, 1, 1);
        double result = net.e175.klaus.solarpositioning.DeltaT.estimate(forDate);
        assertEquals(63.86000000000001, result, 0.00001);
    }

}