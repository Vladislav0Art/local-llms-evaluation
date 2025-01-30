package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateYearLowerThanMinus500Test {

    @Test
    public void estimateYearLowerThanMinus500Test() {
        LocalDate date = LocalDate.of(-601, 6, 30);
        double result = DeltaT.estimate(date);
        Assert.assertEquals(-464.39456, result, 0.0);
    }

}