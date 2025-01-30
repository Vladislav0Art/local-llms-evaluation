package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateYearLowerThan2150Test {

    @Test
    public void estimateYearLowerThan2150Test() {
        LocalDate date = LocalDate.of(2050, 6, 30);
        double result = DeltaT.estimate(date);
        Assert.assertEquals(68.342255, result, 0.0);
    }

}