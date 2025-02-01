package net.e175.klaus.solarpositioning;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateYearLessThan500Test {

    @Test
    public void estimateYearLessThan500Test() {
        LocalDate date = LocalDate.of(400, 12, 31);
        Assert.assertEquals(14403.5872544, DeltaT.estimate(date), 0.00001);
    }

}