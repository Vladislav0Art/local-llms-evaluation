package net.e175.klaus.solarpositioning;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateYearBetween500And1600Test {

    @Test
    public void estimateYearBetween500And1600Test() {
        LocalDate forDate = LocalDate.of(1550, 6, 15);
        Assert.assertEquals(1083.83, DeltaT.estimate(forDate), 0.01);
    }

}