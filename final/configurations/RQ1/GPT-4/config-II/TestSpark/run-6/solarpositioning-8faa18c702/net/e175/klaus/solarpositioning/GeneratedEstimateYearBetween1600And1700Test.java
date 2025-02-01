package net.e175.klaus.solarpositioning;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateYearBetween1600And1700Test {

    @Test
    public void estimateYearBetween1600And1700Test() {
        LocalDate forDate = LocalDate.of(1650, 6, 15);
        Assert.assertEquals(35.83, DeltaT.estimate(forDate), 0.01);
    }

}