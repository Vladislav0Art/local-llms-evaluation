package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateYearLowerThan1900Test {

    @Test
    public void estimateYearLowerThan1900Test() {
        LocalDate date = LocalDate.of(1860, 6, 30);
        double result = DeltaT.estimate(date);
        Assert.assertEquals(7.759775591647688, result, 0.0);
    }

}