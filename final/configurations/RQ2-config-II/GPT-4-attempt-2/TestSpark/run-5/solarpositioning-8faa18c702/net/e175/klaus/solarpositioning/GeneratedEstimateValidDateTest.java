package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.Assert;

import java.time.LocalDate;

public class GeneratedEstimateValidDateTest {

    @Test
    public void estimateValidDateTest() {
        LocalDate testDate = LocalDate.of(2022, 05, 01);
        double result = DeltaT.estimate(testDate);

        Assert.assertNotNull("Failed because result is Null", result);
        Assert.assertTrue("Failed because the result is not valid", result > 0);
    }

}