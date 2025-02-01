package net.e175.klaus.solarpositioning;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateYearLessThan2050Test {

    @Test
    public void estimateYearLessThan2050Test() {
        LocalDate date = LocalDate.of(2045, 12, 31);
        Assert.assertEquals(74.73155891, DeltaT.estimate(date), 0.00001);
    }

}