package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.Assert;

import java.time.LocalDate;

public class GeneratedEstimatePastYearDateTest {

    @Test
    public void estimatePastYearDateTest() {
        LocalDate pastYearDate = LocalDate.of(1922, 1, 1);
        double result = DeltaT.estimate(pastYearDate);
        Assert.assertTrue(result >= 0);
    }

}