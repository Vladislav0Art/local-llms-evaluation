package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateYearLowerThan1941Test {

    @Test
    public void estimateYearLowerThan1941Test() {
        LocalDate date = LocalDate.of(1920, 6, 30);
        double result = DeltaT.estimate(date);
        Assert.assertEquals(21.50531878, result, 0.0);
    }

}