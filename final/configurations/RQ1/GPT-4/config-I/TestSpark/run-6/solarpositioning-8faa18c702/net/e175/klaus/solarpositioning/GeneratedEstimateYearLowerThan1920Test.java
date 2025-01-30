package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateYearLowerThan1920Test {

    @Test
    public void estimateYearLowerThan1920Test() {
        LocalDate date = LocalDate.of(1900, 6, 30);
        double result = DeltaT.estimate(date);
        Assert.assertEquals(-1.71909589165456, result, 0.0);
    }

}