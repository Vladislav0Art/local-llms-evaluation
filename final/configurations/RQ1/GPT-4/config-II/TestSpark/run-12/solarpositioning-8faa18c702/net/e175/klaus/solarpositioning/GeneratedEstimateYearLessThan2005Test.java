package net.e175.klaus.solarpositioning;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateYearLessThan2005Test {

    @Test
    public void estimateYearLessThan2005Test() {
        LocalDate date = LocalDate.of(2000, 12, 31);
        Assert.assertEquals(64.96892847, DeltaT.estimate(date), 0.00001);
    }

}