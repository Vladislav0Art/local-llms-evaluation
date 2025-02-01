package net.e175.klaus.solarpositioning;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateYearBetween1860And1900Test {

    @Test
    public void estimateYearBetween1860And1900Test() {
        LocalDate forDate = LocalDate.of(1880, 6, 15);
        Assert.assertEquals(1.82, DeltaT.estimate(forDate), 0.01);
    }

}