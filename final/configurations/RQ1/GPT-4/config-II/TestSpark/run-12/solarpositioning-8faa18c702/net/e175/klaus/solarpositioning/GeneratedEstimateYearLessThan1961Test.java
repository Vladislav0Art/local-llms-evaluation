package net.e175.klaus.solarpositioning;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateYearLessThan1961Test {

    @Test
    public void estimateYearLessThan1961Test() {
        LocalDate date = LocalDate.of(1955, 6, 30);
        Assert.assertEquals(30.78575531, DeltaT.estimate(date), 0.00001);
    }

}