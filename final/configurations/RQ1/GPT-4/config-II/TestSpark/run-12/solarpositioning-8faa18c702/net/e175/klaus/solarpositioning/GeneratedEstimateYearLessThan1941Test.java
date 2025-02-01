package net.e175.klaus.solarpositioning;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateYearLessThan1941Test {

    @Test
    public void estimateYearLessThan1941Test() {
        LocalDate date = LocalDate.of(1940, 12, 31);
        Assert.assertEquals(26.14274632, DeltaT.estimate(date), 0.00001);
    }

}