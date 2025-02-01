package net.e175.klaus.solarpositioning;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateYearLessThan1900Test {

    @Test
    public void estimateYearLessThan1900Test() {
        LocalDate date = LocalDate.of(1890, 12, 31);
        Assert.assertEquals(-2.60039770, DeltaT.estimate(date), 0.00001);
    }

}