package net.e175.klaus.solarpositioning;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateYearBetween1941And1961Test {

    @Test
    public void estimateYearBetween1941And1961Test() {
        LocalDate forDate = LocalDate.of(1950, 6, 15);
        Assert.assertEquals(29.8, DeltaT.estimate(forDate), 0.01);
    }

}