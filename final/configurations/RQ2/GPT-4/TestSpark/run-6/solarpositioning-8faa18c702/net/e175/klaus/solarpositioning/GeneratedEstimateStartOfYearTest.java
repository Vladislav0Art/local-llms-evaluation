package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.Assert;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateStartOfYearTest {

    @Test
    public void estimateStartOfYearTest() {
        LocalDate startOfYear = LocalDate.of(2021, 1, 1);
        double result = DeltaT.estimate(startOfYear);
        assertEquals(71.67459440578172, result, 0.001);
    }

}