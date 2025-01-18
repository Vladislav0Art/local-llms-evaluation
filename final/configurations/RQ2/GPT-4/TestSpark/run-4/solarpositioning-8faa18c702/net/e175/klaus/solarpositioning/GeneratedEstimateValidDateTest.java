package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.Assert;

import java.time.LocalDate;

public class GeneratedEstimateValidDateTest {

    @Test
    public void estimateValidDateTest() {
        LocalDate testDate = LocalDate.of(2022, 1, 1);
        double result = DeltaT.estimate(testDate);
        Assert.assertTrue(result >= 0);
    }

}