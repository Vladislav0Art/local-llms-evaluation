package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.Assert;

import java.time.LocalDate;

public class GeneratedEstimateLeapYearDateTest {

    @Test
    public void estimateLeapYearDateTest() {
        LocalDate leapYearDate = LocalDate.of(2020, 2, 29);
        double result = DeltaT.estimate(leapYearDate);
        Assert.assertTrue(result >= 0);
    }

}