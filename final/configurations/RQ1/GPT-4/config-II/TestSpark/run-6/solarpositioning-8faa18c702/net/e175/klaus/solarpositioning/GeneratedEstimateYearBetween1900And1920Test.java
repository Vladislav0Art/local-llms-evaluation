package net.e175.klaus.solarpositioning;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateYearBetween1900And1920Test {

    @Test
    public void estimateYearBetween1900And1920Test() {
        LocalDate forDate = LocalDate.of(1910, 6, 15);
        Assert.assertEquals(17.00, DeltaT.estimate(forDate), 0.01);
    }

}