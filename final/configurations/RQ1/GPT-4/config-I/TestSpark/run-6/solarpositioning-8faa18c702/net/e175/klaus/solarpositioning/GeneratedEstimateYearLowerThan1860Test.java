package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateYearLowerThan1860Test {

    @Test
    public void estimateYearLowerThan1860Test() {
        LocalDate date = LocalDate.of(1800, 6, 30);
        double result = DeltaT.estimate(date);
        Assert.assertEquals(14.674321059004996, result, 0.0);
    }

}