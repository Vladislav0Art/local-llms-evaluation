package net.e175.klaus.solarpositioning;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateYearBetween1920And1941Test {

    @Test
    public void estimateYearBetween1920And1941Test() {
        LocalDate forDate = LocalDate.of(1930, 6, 15);
        Assert.assertEquals(24.27, DeltaT.estimate(forDate), 0.01);
    }

}