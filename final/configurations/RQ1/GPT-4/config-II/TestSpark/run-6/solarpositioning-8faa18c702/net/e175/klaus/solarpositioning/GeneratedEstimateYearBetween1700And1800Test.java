package net.e175.klaus.solarpositioning;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateYearBetween1700And1800Test {

    @Test
    public void estimateYearBetween1700And1800Test() {
        LocalDate forDate = LocalDate.of(1750, 6, 15);
        Assert.assertEquals(13.36, DeltaT.estimate(forDate), 0.01);
    }

}