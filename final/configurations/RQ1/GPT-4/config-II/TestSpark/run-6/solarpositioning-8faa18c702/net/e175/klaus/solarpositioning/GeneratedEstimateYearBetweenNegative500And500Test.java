package net.e175.klaus.solarpositioning;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateYearBetweenNegative500And500Test {

    @Test
    public void estimateYearBetweenNegative500And500Test() {
        LocalDate forDate = LocalDate.of(200, 6, 15);
        Assert.assertEquals(8841.85, DeltaT.estimate(forDate), 0.01);
    }

}