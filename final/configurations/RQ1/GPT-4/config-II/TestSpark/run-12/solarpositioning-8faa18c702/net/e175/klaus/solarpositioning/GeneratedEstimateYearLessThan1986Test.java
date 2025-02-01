package net.e175.klaus.solarpositioning;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateYearLessThan1986Test {

    @Test
    public void estimateYearLessThan1986Test() {
        LocalDate date = LocalDate.of(1985, 12, 31);
        Assert.assertEquals(53.21430012, DeltaT.estimate(date), 0.00001);
    }

}