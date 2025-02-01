package net.e175.klaus.solarpositioning;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateYearGreaterThan2150Test {

    @Test
    public void estimateYearGreaterThan2150Test() {
        LocalDate date = LocalDate.of(2151, 12, 31);
        Assert.assertEquals(426.21875, DeltaT.estimate(date), 0.00001);
    }

}