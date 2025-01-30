package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateYearHigherThan2150Test {

    @Test
    public void estimateYearHigherThan2150Test() {
        LocalDate date = LocalDate.of(2151, 6, 30);
        double result = DeltaT.estimate(date);
        Assert.assertEquals(101.7059078432, result, 0.0);
    }

}