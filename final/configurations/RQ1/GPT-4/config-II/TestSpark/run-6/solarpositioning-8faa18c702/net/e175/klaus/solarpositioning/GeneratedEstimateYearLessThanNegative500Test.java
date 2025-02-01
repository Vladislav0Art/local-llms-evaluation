package net.e175.klaus.solarpositioning;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateYearLessThanNegative500Test {

    @Test
    public void estimateYearLessThanNegative500Test() {
        LocalDate forDate = LocalDate.of(-501, 6, 15);
        Assert.assertEquals(-202.25, DeltaT.estimate(forDate), 0.01);
    }

}