package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateYearLowerThan500Test {

    @Test
    public void estimateYearLowerThan500Test() {
        LocalDate date = LocalDate.of(-499, 6, 30);
        double result = DeltaT.estimate(date);
        Assert.assertEquals(10723.45224, result, 0.0);
    }

}