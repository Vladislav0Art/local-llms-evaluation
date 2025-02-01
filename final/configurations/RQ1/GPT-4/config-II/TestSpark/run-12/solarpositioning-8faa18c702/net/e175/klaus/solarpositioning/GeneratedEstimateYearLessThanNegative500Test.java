package net.e175.klaus.solarpositioning;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateYearLessThanNegative500Test {

    @Test
    public void estimateYearLessThanNegative500Test() {
        LocalDate date = LocalDate.of(-501, 1, 1);
        Assert.assertEquals(7958.72, DeltaT.estimate(date), 0.00001);
    }

}