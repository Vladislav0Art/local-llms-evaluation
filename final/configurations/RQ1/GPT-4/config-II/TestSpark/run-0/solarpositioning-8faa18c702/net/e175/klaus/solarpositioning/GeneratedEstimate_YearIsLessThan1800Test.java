package net.e175.klaus.solarpositioning;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimate_YearIsLessThan1800Test {

    @Test
    public void estimate_YearIsLessThan1800Test() {
        double deltaT = DeltaT.estimate(LocalDate.of(1750, 10, 1));
        Assert.assertEquals(13.568, deltaT, 0.1);
    }

}