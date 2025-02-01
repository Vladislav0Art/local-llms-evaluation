package net.e175.klaus.solarpositioning;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateYearLessThan1700Test {

    @Test
    public void estimateYearLessThan1700Test() {
        LocalDate date = LocalDate.of(1650, 12, 31);
        Assert.assertEquals(10.87883134, DeltaT.estimate(date), 0.00001);
    }

}