package net.e175.klaus.solarpositioning;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateYearLessThan1800Test {

    @Test
    public void estimateYearLessThan1800Test() {
        LocalDate date = LocalDate.of(1750, 12, 31);
        Assert.assertEquals(13.42753096, DeltaT.estimate(date), 0.00001);
    }

}