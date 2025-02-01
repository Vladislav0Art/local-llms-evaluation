package net.e175.klaus.solarpositioning;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimate_YearIsLessThan1860Test {

    @Test
    public void estimate_YearIsLessThan1860Test() {
        double deltaT = DeltaT.estimate(LocalDate.of(1850, 6, 1));
        Assert.assertEquals(7.2124, deltaT, 0.1);
    }

}