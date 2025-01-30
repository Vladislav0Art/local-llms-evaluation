package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateYearLowerThan1700Test {

    @Test
    public void estimateYearLowerThan1700Test() {
        LocalDate date = LocalDate.of(1600, 6, 30);
        double result = DeltaT.estimate(date);
        Assert.assertEquals(121.81945766678516, result, 0.0);
    }

}