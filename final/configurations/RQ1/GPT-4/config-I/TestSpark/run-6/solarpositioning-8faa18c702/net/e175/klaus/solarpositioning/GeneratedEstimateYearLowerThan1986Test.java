package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateYearLowerThan1986Test {

    @Test
    public void estimateYearLowerThan1986Test() {
        LocalDate date = LocalDate.of(1961, 6, 30);
        double result = DeltaT.estimate(date);
        Assert.assertEquals(37.28128, result, 0.0);
    }

}