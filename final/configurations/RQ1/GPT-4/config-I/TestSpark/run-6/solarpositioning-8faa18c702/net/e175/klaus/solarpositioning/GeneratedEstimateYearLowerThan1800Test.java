package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateYearLowerThan1800Test {

    @Test
    public void estimateYearLowerThan1800Test() {
        LocalDate date = LocalDate.of(1700, 6, 30);
        double result = DeltaT.estimate(date);
        Assert.assertEquals(10.249299146908999, result, 0.0);
    }

}