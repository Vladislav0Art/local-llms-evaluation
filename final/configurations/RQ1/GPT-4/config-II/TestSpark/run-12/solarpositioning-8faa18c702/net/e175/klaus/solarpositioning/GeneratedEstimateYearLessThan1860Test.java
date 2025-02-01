package net.e175.klaus.solarpositioning;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateYearLessThan1860Test {

    @Test
    public void estimateYearLessThan1860Test() {
        LocalDate date = LocalDate.of(1850, 12, 31);
        Assert.assertEquals(7.57817818, DeltaT.estimate(date), 0.00001);
    }

}