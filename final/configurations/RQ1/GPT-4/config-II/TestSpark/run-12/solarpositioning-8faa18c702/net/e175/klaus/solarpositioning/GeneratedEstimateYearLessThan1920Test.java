package net.e175.klaus.solarpositioning;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateYearLessThan1920Test {

    @Test
    public void estimateYearLessThan1920Test() {
        LocalDate date = LocalDate.of(1915, 6, 30);
        Assert.assertEquals(15.84690840, DeltaT.estimate(date), 0.00001);
    }

}