package net.e175.klaus.solarpositioning;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateYearBetween1961And1986Test {

    @Test
    public void estimateYearBetween1961And1986Test() {
        LocalDate forDate = LocalDate.of(1970, 6, 15);
        Assert.assertEquals(44.49, DeltaT.estimate(forDate), 0.01);
    }

}