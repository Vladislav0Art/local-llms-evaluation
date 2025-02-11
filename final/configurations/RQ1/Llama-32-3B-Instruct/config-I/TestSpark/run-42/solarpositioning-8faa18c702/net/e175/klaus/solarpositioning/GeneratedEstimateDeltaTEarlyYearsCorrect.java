package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class GeneratedEstimateDeltaTEarlyYearsCorrect {

    @Test
    public void estimateDeltaTEarlyYearsCorrect() {
        LocalDate forDate = LocalDate.of(1820, 1, 1);
        double result = net.e175.klaus.solarpositioning.DeltaT.estimate(forDate);
        assertEquals(-20.0, result, 0.00001);
    }

}