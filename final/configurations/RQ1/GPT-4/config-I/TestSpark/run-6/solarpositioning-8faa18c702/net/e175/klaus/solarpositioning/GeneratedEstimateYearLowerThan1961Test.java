package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateYearLowerThan1961Test {

    @Test
    public void estimateYearLowerThan1961Test() {
        LocalDate date = LocalDate.of(1941, 6, 30);
        double result = DeltaT.estimate(date);
        Assert.assertEquals(27.8943597561, result, 0.0);
    }

}