package net.e175.klaus.solarpositioning;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateYearBetween2050And2150Test {

    @Test
    public void estimateYearBetween2050And2150Test() {
        LocalDate forDate = LocalDate.of(2100, 6, 15);
        Assert.assertEquals(415.30, DeltaT.estimate(forDate), 0.01);
    }

}