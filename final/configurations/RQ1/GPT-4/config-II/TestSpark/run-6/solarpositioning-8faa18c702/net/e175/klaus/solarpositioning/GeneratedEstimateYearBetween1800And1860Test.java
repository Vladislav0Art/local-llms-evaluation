package net.e175.klaus.solarpositioning;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateYearBetween1800And1860Test {

    @Test
    public void estimateYearBetween1800And1860Test() {
        LocalDate forDate = LocalDate.of(1850, 6, 15);
        Assert.assertEquals(7.63, DeltaT.estimate(forDate), 0.01);
    }

}