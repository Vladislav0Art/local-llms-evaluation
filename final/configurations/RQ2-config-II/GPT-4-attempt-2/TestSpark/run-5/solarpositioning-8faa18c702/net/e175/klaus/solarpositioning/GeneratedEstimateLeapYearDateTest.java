package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.Assert;

import java.time.LocalDate;

public class GeneratedEstimateLeapYearDateTest {

    @Test
    public void estimateLeapYearDateTest() {
        LocalDate leapYearDate = LocalDate.of(2024, 02, 29);
        double result = DeltaT.estimate(leapYearDate);

        Assert.assertNotNull("Failed because result is Null", result);
        Assert.assertTrue("Failed because the result is not valid", result > 0);
    }

}