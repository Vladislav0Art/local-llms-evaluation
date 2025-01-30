package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateYearLowerThan2005Test {

    @Test
    public void estimateYearLowerThan2005Test() {
        LocalDate date = LocalDate.of(1986, 6, 30);
        double result = DeltaT.estimate(date);
        Assert.assertEquals(59.11580425242563, result, 0.0);
    }

}