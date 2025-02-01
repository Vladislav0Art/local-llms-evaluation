package net.e175.klaus.solarpositioning;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateYearGreaterThan2150Test {

    @Test
    public void estimateYearGreaterThan2150Test() {
        LocalDate forDate = LocalDate.of(2200, 6, 15);
        Assert.assertEquals(441.39, DeltaT.estimate(forDate), 0.01);
    }

}