package net.e175.klaus.solarpositioning;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateYearBetween1986And2005Test {

    @Test
    public void estimateYearBetween1986And2005Test() {
        LocalDate forDate = LocalDate.of(1995, 6, 15);
        Assert.assertEquals(63.82, DeltaT.estimate(forDate), 0.01);
    }

}