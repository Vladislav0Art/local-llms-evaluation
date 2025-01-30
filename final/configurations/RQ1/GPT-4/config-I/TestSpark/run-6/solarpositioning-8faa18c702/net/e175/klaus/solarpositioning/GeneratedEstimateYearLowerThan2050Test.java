package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateYearLowerThan2050Test {

    @Test
    public void estimateYearLowerThan2050Test() {
        LocalDate date = LocalDate.of(2005, 6, 30);
        double result = DeltaT.estimate(date);
        Assert.assertEquals(68.739392125, result, 0.0);
    }

}