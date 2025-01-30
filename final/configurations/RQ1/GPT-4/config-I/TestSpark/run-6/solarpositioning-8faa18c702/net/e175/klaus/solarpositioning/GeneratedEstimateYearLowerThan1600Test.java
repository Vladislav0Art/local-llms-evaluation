package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateYearLowerThan1600Test {

    @Test
    public void estimateYearLowerThan1600Test() {
        LocalDate date = LocalDate.of(500, 6, 30);
        double result = DeltaT.estimate(date);
        Assert.assertEquals(1614.6645672, result, 0.0);
    }

}