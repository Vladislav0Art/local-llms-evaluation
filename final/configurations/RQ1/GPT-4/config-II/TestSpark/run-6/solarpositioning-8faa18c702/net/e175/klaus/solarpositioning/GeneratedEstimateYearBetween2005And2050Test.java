package net.e175.klaus.solarpositioning;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateYearBetween2005And2050Test {

    @Test
    public void estimateYearBetween2005And2050Test() {
        LocalDate forDate = LocalDate.of(2020, 6, 15);
        Assert.assertEquals(69.37, DeltaT.estimate(forDate), 0.01);
    }

}